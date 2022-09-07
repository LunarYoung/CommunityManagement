package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.AppBaseRsp;
import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.response.AppletsRsp;
import com.zqg.communityManagementBackend.dto.response.ManageRsp;
import com.zqg.communityManagementBackend.entity.*;
import com.zqg.communityManagementBackend.service.AppAppletsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @creteTime: 2021/12/30 18:32
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Applets")
public class AppAppletsController {
    @Autowired
    private AppAppletsService appAppletsService;


    @PostMapping("/Applets")
    public AppBaseRsp updateApplets(@Validated @RequestBody Applets applets, BindingResult result){
        if(!result.hasErrors())
        {
            appAppletsService.updateApplets(applets);
            return AppBaseRsp.builder().code(200).msg("修改成功").build();
        }
        else {
            return AppBaseRsp.builder().code(500).msg("内部错误").build();
        }

    }

    @GetMapping("/select")
    public AppletsRsp selectApplets(){
        AppletsRsp rsp = new AppletsRsp();
        rsp.setData(appAppletsService.selectApplets());
        rsp.setCode(200);
        rsp.setMsg("ok");
       return rsp;
    }

    @PostMapping("/my/com")
    public List<Member> selectApplets(@RequestParam(value = "openId", required = true) String openId){
        return appAppletsService.selectMyCom(openId);
    }
    @PostMapping("/my/apply")
    public List<AllApply> selectApply(@RequestParam(value = "openId", required = true) String openId){
        return appAppletsService.selectMyApply(openId);
    }

    @PostMapping("/reason")
    public void updateMyCom(@RequestParam(value = "openId") String openId,@RequestParam(value = "association") String association){
        MyCom myCom = null;
        myCom.setOpenId(openId);
        myCom.setPosition("已退团");
        myCom.setAssociation(association);
         appAppletsService.selectMyCom(openId);
    }

    @PostMapping("/deleteManage")
    public BaseRsp deleteManage(@RequestParam String name){
        appAppletsService.deleteManage(name);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        return rsp;
    }

    @PostMapping("/selectManage")
    public ManageRsp selectManage(@RequestBody Manage manage){
        ManageRsp rsp = new ManageRsp();
        Applets applets = new Applets();
        applets = appAppletsService.selectApplets();
        if("normal".equals(applets.getName())){
            rsp.setCode(201);
            rsp.setMsg("权限不足");
            return rsp;
        }
        if(manage.getName()!=null && manage.getPassword()!=null && manage.getPassword()!="" && manage.getName()!=""){
            appAppletsService.addManage(manage);
        }
        rsp.setCode(200);
        rsp.setManage(appAppletsService.selectManage());
        return rsp;
    }


}
