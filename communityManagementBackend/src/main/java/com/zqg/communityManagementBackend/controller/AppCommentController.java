package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.entity.AppDusRsp;
import com.zqg.communityManagementBackend.service.AppCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @creteTime: 2022/2/20 2:46
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/AppComment")
public class AppCommentController {
    @Autowired
    AppCommentService appCommentService;
//    @PostMapping("/appDusViewId")
//    @ResponseBody
//    public AppDusRsp appViewId(@RequestParam Integer id){
//        System.out.println(id);
//        System.out.println(appDusService.appDusViewId(id));
//        return appDusService.appDusViewId(id);
//    }
}
