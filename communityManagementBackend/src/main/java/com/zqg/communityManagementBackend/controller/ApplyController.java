package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ApplyUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.QueryApplyReq;
import com.zqg.communityManagementBackend.dto.response.AllApplyRsp;
import com.zqg.communityManagementBackend.dto.response.FeedbackRsp;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Feedback;
import com.zqg.communityManagementBackend.entity.Member;
import com.zqg.communityManagementBackend.service.AllApplyService;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @creteTime: 2022/2/14 14:26
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Apply")
public class ApplyController {
    @Autowired
    AllApplyService allApplyService;
    @Autowired
    private CountAllService countAllService;
    @Autowired
    MemberService memberService;
    @PostMapping("/ApplyList")
    @ResponseBody
    public AllApplyRsp AllApplyList(@RequestBody Page page){
        List<AllApply>  list;
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        list = allApplyService.getAllApplyList(query);
        int count = countAllService.countAllApply();
        List<String> ass = memberService.getCol();
        AllApplyRsp rsp  = new AllApplyRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        rsp.setAss(ass);
        return rsp;
    }

    @PostMapping("/getHistoryAllApplyList")
    @ResponseBody
    public AllApplyRsp getHistoryAllApplyList(@RequestBody Page page){
        List<AllApply>  list;
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        list = allApplyService.getHistoryAllApplyList(query);
        int count = countAllService.countAllApply();
        List<String> ass = memberService.getCol();
        AllApplyRsp rsp  = new AllApplyRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        rsp.setAss(ass);
        return rsp;
    }


    @PostMapping("/queryMember")
    @ResponseBody
    public AllApplyRsp  queryApply(@RequestBody QueryApplyReq queryApplyReq){
        AllApplyRsp rsp  = new AllApplyRsp();
        List<AllApply>  list;
        list = allApplyService.queryMember(queryApplyReq);
        int count = list.size();
        List<String> ass = memberService.getCol();
        rsp.setCount(count);
        rsp.setAss(ass);
        rsp.setData(list);
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/queryHistoryMember")
    @ResponseBody
    public AllApplyRsp queryHistoryMember(@RequestBody QueryApplyReq queryApplyReq){
        AllApplyRsp rsp  = new AllApplyRsp();
        List<AllApply>  list;
        list = allApplyService.queryHistoryMember(queryApplyReq);
        int count = list.size();
        List<String> ass = memberService.getCol();
        rsp.setCount(count);
        rsp.setAss(ass);
        rsp.setData(list);
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/updateStatus")
    @ResponseBody
    public BaseRsp  updateStatus(@RequestBody ApplyUpdateStatus applyUpdateStatus){
        allApplyService.ApplyUpdateStatus(applyUpdateStatus);
        if(applyUpdateStatus.getStatus().equals("录取"))
        {
            AllApply allApply = allApplyService.getForMember(applyUpdateStatus.getId());
            Member member = new Member();
            member.setId(allApply.getId());
            member.setTime(allApply.getApplyTime());
            member.setName(allApply.getName());
            member.setPosition("社员");
            member.setStatus("在职");
            member.setAss(allApply.getApplyAssociation());
            member.setOpenId(allApply.getOpenId());
            member.setDepart(allApply.getDepart());
            member.setImage(allApply.getImage());
            memberService.insertMember(member);

        }


        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/addApply")
    @ResponseBody
    public void ddApply(@RequestBody AllApply allApply){
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        allApply.setApplyTime(str);
        allApply.setStatus("未面试");
        System.out.println(allApply);
        allApplyService.addApply(allApply);
        return ;
    }

}
