package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.response.AllApplyRsp;
import com.zqg.communityManagementBackend.dto.response.AppIndexRsp;
import com.zqg.communityManagementBackend.entity.*;
import com.zqg.communityManagementBackend.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @creteTime: 2022/2/18 15:10
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Index")
public class AppIndexController {
    @Autowired
    MemberService memberService;
    @Autowired
    ActionService actionService;
    @Autowired
    ArticleService articleService;
    @Autowired
    AppNoticeService appNoticeService;
    @Autowired
    private AppAppletsService appAppletsService;


    @GetMapping("/indexList")
    public AppIndexRsp AppIndex(){
        AppIndexRsp rsp = new AppIndexRsp();
        Page page = new Page();
        page.setPageSize(100);
        page.setStartPage(0);
        rsp.setArticle(articleService.getArticleList(page));
        rsp.setImg(appAppletsService.selectApplets());
        return rsp;
    }

    @GetMapping("/assList")
    public List assList(){
        List<String> ass = memberService.getCol();
        return ass;
    }

    @PostMapping("/appNotice")
    @ResponseBody
    public List appNotice(@RequestParam String id){
        System.out.println(id);
        return appNoticeService.appNotice(id);
    }

    @PostMapping("/sign")
    @ResponseBody
    public void sign(@RequestParam Integer id){
        System.out.println(id);
        appAppletsService.sign(id);
    }


    @PostMapping("/addAppPub")
    @ResponseBody
    public void appNotice(@RequestBody Public p){
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        p.setTime(str);
        appAppletsService.addPublic(p);
        System.out.println(p);

    }

    @GetMapping("/itemList")
    public List itemList(){
        return actionService.getCol();
    }


    @PostMapping("/myApply")
    @ResponseBody
    public List myApply(@RequestBody String id){

        return null;
    }
}
