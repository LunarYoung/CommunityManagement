package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.request.PublicReq;
import com.zqg.communityManagementBackend.dto.response.PublicRsp;
import com.zqg.communityManagementBackend.entity.Item;
import com.zqg.communityManagementBackend.service.ActionService;
import com.zqg.communityManagementBackend.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @creteTime: 2022/2/21 20:20
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/Public")
@CrossOrigin
public class PublicRegistrationController {
    @Autowired
    ActionService actionService;
    @Autowired
    MemberService memberService;

    @PostMapping("/manage")
    @ResponseBody
    public PublicRsp selectPublic(@RequestBody PublicReq publicReq){
        PublicRsp rsp = new PublicRsp();
        publicReq.setStartPage((publicReq.getStartPage()-1)* publicReq.getPageSize());
        rsp.setAss(memberService.getCol());
        rsp.setItem(actionService.getCol());
        rsp.setDate(actionService.queryPublic(publicReq));
        rsp.setCount(actionService.countPublic(publicReq));
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/add")
    @ResponseBody
    public BaseRsp addItem(@RequestBody Item item){
        actionService.addItem(item);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
}
