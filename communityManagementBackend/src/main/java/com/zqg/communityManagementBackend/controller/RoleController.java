package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.AppBaseRsp;
import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.request.UserReq;
import com.zqg.communityManagementBackend.entity.Applets;
import com.zqg.communityManagementBackend.entity.Manage;
import com.zqg.communityManagementBackend.entity.Role;
import com.zqg.communityManagementBackend.entity.User;
import com.zqg.communityManagementBackend.service.AppAppletsService;
import com.zqg.communityManagementBackend.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @creteTime: 2021/12/30 18:32
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/role")
@CrossOrigin
public class RoleController {
    //{
//    roles: ['admin'],
//    introduction: 'I am a super administrator',
//    avatar: 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif',
//    name: 'Super Admin'
//  },
    @Autowired
    AppAppletsService appAppletsService;
    @PostMapping("/login")
    public Role roles(@RequestBody Map map) {
        Role role = new Role();
        String mid = (String) map.get("username");
        String cir = (String) map.get("password");
        if(cir.equals(appAppletsService.confirmManage(mid))) {
            if("admin".equals(mid)){
                appAppletsService.updateManage("admin");
            }else {
                appAppletsService.updateManage("normal");
            }
            role.setCode(200);
            role.setRoles("admin");
            role.setName("Super Admin");
            role.setIntroduction("I am a super administrator");
            role.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
            return role;
        }
        else {
            return null;
        }
        //role.setToken("Admin-Token");

    }

    @GetMapping("/info")
    @ResponseBody
    public Role userInfo( ) {
        System.out.println("===");
        Role role = new Role();
        role.setCode(200);
        role.setRoles("admin");
        role.setName("Super Admin");
        role.setIntroduction("I am a super administrator");
        role.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return role;
    }

    @PostMapping("/logout")
    public BaseRsp logout() {
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
}

