package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.MemberReq;
import com.zqg.communityManagementBackend.dto.response.MemberRsp;
import com.zqg.communityManagementBackend.entity.Member;
import com.zqg.communityManagementBackend.entity.UpdateMember;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @creteTime: 2022/2/16 9:47
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    MemberService memberService;
    @Autowired
    private CountAllService countAllService;

    @PostMapping("/MemberList")
    @ResponseBody
    public MemberRsp MemberList(@RequestBody Page page){
        List<Member> list;
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        list = memberService.getMemberList(query);
        int count = countAllService.countMember();
        MemberRsp rsp  = new MemberRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        List<String> ass = memberService.getCol();
        rsp.setAss(ass);
        return rsp;
    }


    @PostMapping("/queryMember")
    @ResponseBody
    public MemberRsp queryMember(@RequestBody MemberReq memberReq){
        List<Member> list;

        list = memberService.queryMember(memberReq);
        int count = list.size();
        MemberRsp rsp  = new MemberRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        List<String> ass = memberService.getCol();
        rsp.setAss(ass);
        return rsp;
    }

    @PostMapping("/deleteMemberById")
    public BaseRsp deleteMemberById(@RequestParam Integer id){
        memberService.deleteMemberById(id);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/updateMemberById")
    @ResponseBody
    public BaseRsp updateMember(@RequestBody  UpdateMember updateMember){

        memberService.updateMemberById(updateMember);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

}
