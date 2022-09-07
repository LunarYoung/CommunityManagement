package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.response.ArticleBaseRsp;
import com.zqg.communityManagementBackend.entity.DashboardBaseRsp;
import com.zqg.communityManagementBackend.entity.DashboardGradeRsp;
import com.zqg.communityManagementBackend.entity.PieRsp;
import com.zqg.communityManagementBackend.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @creteTime: 2022/2/21 1:31
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Dashboard")
public class DashboardController {
    @Autowired
    DashboardService dashboardService;


    @GetMapping("/base")
    @ResponseBody
    public DashboardBaseRsp base(){

        DashboardBaseRsp rsp = new DashboardBaseRsp();
        rsp.setApply(dashboardService.countApply());
        rsp.setComment(dashboardService.countDusComment()+dashboardService.countArtComment());
        rsp.setPerson(dashboardService.countPerson());
        rsp.setView(dashboardService.countArtView()+dashboardService.countDusView());
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
    @GetMapping("/grade")
    @ResponseBody
    public DashboardGradeRsp grade(){

        DashboardGradeRsp rsp = new DashboardGradeRsp();
        List<Integer> list = new ArrayList();
        list.add(dashboardService.countGrade1());
        list.add(dashboardService.countGrade2());
        list.add(dashboardService.countGrade3());
        list.add(dashboardService.countGrade4());
        rsp.setList(list);
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @GetMapping("/pie")
    @ResponseBody
    public  PieRsp pie(){
        PieRsp rsp = new  PieRsp();
        rsp.setPie(dashboardService.countPie());
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
}
