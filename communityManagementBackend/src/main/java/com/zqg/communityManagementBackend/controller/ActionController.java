package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ActionReq;
import com.zqg.communityManagementBackend.dto.request.ActionUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.NoticeReq;
import com.zqg.communityManagementBackend.dto.response.ActionRsp;
import com.zqg.communityManagementBackend.dto.response.NoticeRsp;
import com.zqg.communityManagementBackend.entity.Action;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Applets;
import com.zqg.communityManagementBackend.entity.Notice;
import com.zqg.communityManagementBackend.service.ActionService;
import com.zqg.communityManagementBackend.service.AppAppletsService;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @creteTime: 2022/2/17 8:51
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Action")
public class ActionController {
    @Autowired
    AppAppletsService appAppletsService;
    @Autowired
    ActionService actionService;
    @Autowired
    MemberService memberService;
    @Autowired
    CountAllService countAllService;

    @PostMapping("/addAction")
    @ResponseBody
    public BaseRsp addAction(@RequestBody Action action) throws ParseException {
        String dateTime = action.getTime();
        dateTime = dateTime .replace("Z", " UTC");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//转换时区格式
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format1 .parse(dateTime );
        String time= format2.format(date);//2019-06-28
        action.setTime(time);

        actionService.addAction(action);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/selectAction")
    @ResponseBody
    public ActionRsp selectAction(@RequestBody ActionReq actionReq){
        //检查权限
        ActionRsp rsp = new ActionRsp();
        Applets applets = new Applets();
        applets = appAppletsService.selectApplets();
        if("normal".equals(applets.getName())){
            rsp.setCode(201);
            rsp.setMsg("权限不足");
            return rsp;
        }
        List<String> ass = memberService.getCol();

        actionReq.setStartPage((actionReq.getStartPage()-1)* actionReq.getPageSize());

        List<Action> list = actionService.queryAction(actionReq);

        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setAss(ass);
        rsp.setCount(countAllService.countAction());
        rsp.setData(list);
        return rsp;
    }

    @PostMapping("/updateStatus")
    @ResponseBody
    public BaseRsp updateStatus(@RequestBody ActionUpdateStatus actionUpdateStatus){
        actionService.updateStatus(actionUpdateStatus);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }


    @PostMapping("/querySign")
    @ResponseBody
    public NoticeRsp querySign(@RequestBody Page page){
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());

        NoticeRsp rsp = new NoticeRsp();
        rsp.setCode(200);
        rsp.setData(actionService.querySign(query));
        rsp.setMsg("success");
        rsp.setCount(countAllService.countNotice());
        return rsp;
    }

    @PostMapping("/addNotice")
    @ResponseBody
    public BaseRsp addNotice(@RequestBody NoticeReq noticeReq) throws ParseException {
        String dateTime = noticeReq.getTime();
        dateTime = dateTime .replace("Z", " UTC"); //2019-06-27T16:00:00.000 UTC
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//转换时区格式
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format1.parse(dateTime );
        String time= format2.format(date);//2019-06-28
        noticeReq.setTime(time);
        List<AllApply> list ;
        list =  actionService.queryNotice(noticeReq.getAss());

        List<Notice> notices = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            Notice notice = new Notice();
            notice.setDepart(list.get(i).getDepart());
            notice.setName(list.get(i).getName());
            notice.setPhone(list.get(i).getPhone());
            notice.setOpen_id(list.get(i).getOpenId());
            notice.setItem(noticeReq.getItem());
            notice.setTime(noticeReq.getTime());
            notice.setDes(noticeReq.getDes());
            if(noticeReq.getSign().equals("是")){
                notice.setSign("未签到");
            }else {
                notice.setSign("无需签到");
            }
            notices.add(notice);
        }
        if(list.size()!=0){
            actionService.batchNotice(notices);
        }

        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

}
