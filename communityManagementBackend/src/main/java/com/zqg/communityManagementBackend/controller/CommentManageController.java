package com.zqg.communityManagementBackend.controller;


import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import com.zqg.communityManagementBackend.dto.response.CommentManageDusRsp;
import com.zqg.communityManagementBackend.dto.response.CommentManageRsp;
import com.zqg.communityManagementBackend.service.CommentManageService;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @creteTime: 2022/2/21 15:44
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/CommentManage")
public class CommentManageController {
    @Autowired
    MemberService memberService;
    @Autowired
    CommentManageService commentManageService;
    @Autowired
    CountAllService countAllService;

    @PostMapping("/article")
    @ResponseBody
    public CommentManageRsp CommentManage(@RequestBody CommentManageReq commentManageReq) {

        commentManageReq.setStartPage((commentManageReq.getStartPage()-1)* commentManageReq.getPageSize());
        CommentManageRsp rsp = new CommentManageRsp();
        rsp.setAAC(commentManageService.commentManage(commentManageReq));
        rsp.setCode(200);
        rsp.setMsg("success");
        List<String> ass = memberService.getCol();
        rsp.setAss(ass);
        rsp.setCount(countAllService.countCommentManage(commentManageReq));
        return rsp;
    }

    @PostMapping("/upCAMstatus")
    public BaseRsp DeleteAssociation(@RequestParam Integer id){
        commentManageService.upCAMstatus(id);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/upAADstatus")
    @ResponseBody
    public BaseRsp upAADstatus(@RequestParam Integer id){
        commentManageService.upAAMstatus(id);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/dus")
    @ResponseBody
    public CommentManageDusRsp CommentManageDus(@RequestBody Page page) {
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        CommentManageDusRsp rsp = new CommentManageDusRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setCount(countAllService.countCommentManageDus());
        rsp.setDusAndComment(commentManageService.commentManageDus(query));
        return rsp;
    }
}
