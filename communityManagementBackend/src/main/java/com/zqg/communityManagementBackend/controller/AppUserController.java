package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.AppBaseRsp;
import com.zqg.communityManagementBackend.dto.request.CodeReq;
import com.zqg.communityManagementBackend.dto.request.UserReq;
import com.zqg.communityManagementBackend.entity.User;
import com.zqg.communityManagementBackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.kevinsawicki.http.HttpRequest;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


/**
 * @creteTime: 2021/12/30 11:15
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/appUser")
@CrossOrigin
public class AppUserController {
    @Autowired
    private UserService userService;

    @PostMapping("/editUser")
    public AppBaseRsp editUser(@Validated @RequestBody UserReq userReq ,BindingResult result){
        if(!result.hasErrors())
        {
            User user = new User();
            user.setUserAppId(userReq.getOpenId());
            user.setAddress(userReq.getAddress());
            user.setDepart(userReq.getDepart());
            user.setGrade(userReq.getGrade());
            user.setSex(userReq.getSex());
            user.setPhone(userReq.getPhone());
            userService.updateUser(user);
            return AppBaseRsp.builder().code(200).msg("修改成功").build();
        }
        else {
            return AppBaseRsp.builder().code(500).msg("内部错误").build();
        }
    }

    @PostMapping("/firstLogin")
    public AppBaseRsp firstLogin(@Validated @RequestBody UserReq userReq,BindingResult result){
        if(!result.hasErrors())
        {
            return AppBaseRsp.builder().code(200).msg("修改成功").build();
        }
        else {
            return AppBaseRsp.builder().code(500).msg("内部错误").build();
        }
    }

    @PostMapping("/getOpenid")
    public String getOpenid(@Validated @RequestBody CodeReq codeReq, BindingResult result){
        final   String appID = "wx5cd14adb5bbdc88f";
        final String appSecret = "bf0961ec2e7169865276ba78c0303303";

        if(!result.hasErrors())
        {
            Map<String, String> data = new HashMap<String, String>();
            data.put("appid", appID);
            data.put("secret", appSecret);
            data.put("js_code", codeReq.getCode());
            data.put("grant_type", "authorization_code");
            String response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").form(data).body();
            String re = response.substring(response.length()-30,response.length()-2);
            userService.insertAppId(re);
            return re;
        }
        else {
            return "error";
        }
    }

}







