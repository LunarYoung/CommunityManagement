package com.zqg.communityManagementBackend.controller;


import com.zqg.communityManagementBackend.dto.AppBaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.UserReq;
import com.zqg.communityManagementBackend.dto.response.FeedbackRsp;
import com.zqg.communityManagementBackend.entity.Feedback;
import com.zqg.communityManagementBackend.entity.User;
import com.zqg.communityManagementBackend.service.CountAllService;
import com.zqg.communityManagementBackend.service.FeedbackService;
import com.zqg.communityManagementBackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @creteTime: 2021/12/30 11:15
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @Autowired
    private CountAllService countAllService;


    @PostMapping("/add")
    public AppBaseRsp firstLogin(@RequestBody Feedback feedback){
        if(feedback.getContent()=="" || feedback.getContent() ==null) {
            return AppBaseRsp.builder().code(500).msg("内部错误").build();
        }
        else {
            Date date = new Date();//获取当前的日期
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
            String str = df.format(date);//获取String类型的时间
            feedback.setTime(str);
            feedbackService.insertFeedback(feedback);
            return AppBaseRsp.builder().code(200).msg("修改成功").build();
        }
        }


    @PostMapping("/feedbackList")
    @ResponseBody
    public FeedbackRsp feedbackList(@RequestBody Page page){
        List<Feedback>  list;
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        list = feedbackService.getFeedbackList(query);
        int count = countAllService.countFeedback();
        FeedbackRsp rsp  = new FeedbackRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        return rsp;
    }

    }









