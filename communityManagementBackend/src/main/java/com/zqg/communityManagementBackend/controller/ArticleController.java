package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.dto.response.AppViewArticleRsp;
import com.zqg.communityManagementBackend.dto.response.ArticleBaseRsp;
import com.zqg.communityManagementBackend.dto.response.ArticleRsp;
import com.zqg.communityManagementBackend.dto.response.VieArticleRsp;
import com.zqg.communityManagementBackend.entity.ArticleComment;
import com.zqg.communityManagementBackend.service.ArticleService;
import com.zqg.communityManagementBackend.service.AutoAddSerice;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @creteTime: 2022/2/18 5:07
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Article")
public class ArticleController {
    @Autowired
    MemberService memberService;
    @Autowired
    AutoAddSerice autoAddSerice;
    @Autowired
    ArticleService articleService;
    @Autowired
    CountAllService countAllService;
    @GetMapping("/base")
    @ResponseBody
    public ArticleBaseRsp Article(){
        ArticleBaseRsp rsp = new ArticleBaseRsp();
        rsp.setCode(200);
        rsp.setAss(memberService.getCol());
        rsp.setMsg("success");
        return rsp;
    }


    @PostMapping("/add")
    @ResponseBody
    public BaseRsp AddArticle(@RequestBody ArticleReq articleReq){
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        articleReq.setTime(str);
        articleReq.setStatus("已发布");
        articleService.addArticle(articleReq);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/getArticleList")
    @ResponseBody
    public ArticleRsp getArticleList(@RequestBody Page page){
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        int count = countAllService.countArticle();
        ArticleRsp rsp = new ArticleRsp();
        rsp.setCount(count);
        rsp.setData(articleService.getArticleList(query));
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
    @PostMapping("/deleteId")
    @ResponseBody
    public BaseRsp deleteId(@RequestParam Integer id){
        articleService.deleteId(id);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/viewId")
    @ResponseBody
    public VieArticleRsp viewId(@RequestParam Integer id){
        VieArticleRsp rsp = new VieArticleRsp();
        rsp.setContent(articleService.viewId(id));
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/appViewId")
    @ResponseBody
    public List appViewId(@RequestParam Integer id){
        autoAddSerice.AuAddArticleView(id);
        List<ArticleComment> articleComments ;
        articleComments = articleService.articleComment(id);
        ArticleReq   articleReq;
        articleReq = articleService.appViewId(id);
        List rsp = new ArrayList();
        rsp.add(articleComments);
        rsp.add(articleReq);
        return rsp;
    }

    @PostMapping("/autoAddArticleStar")
    @ResponseBody
    public void autoAddArticleStar(@RequestParam Integer id){
        autoAddSerice.autoAddArticleStar(id);
    }
    @PostMapping("/addArticleComment")
    void addArticleComment(@RequestBody ArticleComment articleComment){
        articleService.addArticleComment(articleComment);
    }

}
