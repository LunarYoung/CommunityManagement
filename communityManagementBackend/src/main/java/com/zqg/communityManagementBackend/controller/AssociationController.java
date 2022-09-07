package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.response.ActionRsp;
import com.zqg.communityManagementBackend.dto.response.AssociationRsp;
import com.zqg.communityManagementBackend.entity.Applets;
import com.zqg.communityManagementBackend.entity.Association;
import com.zqg.communityManagementBackend.service.AppAppletsService;
import com.zqg.communityManagementBackend.service.AssociationService;
import com.zqg.communityManagementBackend.service.CountAllService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @creteTime: 2022/2/16 5:38
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/Association")
public class AssociationController {
    @Autowired
    AssociationService associationService;
    @Autowired
    AppAppletsService appAppletsService;
    @Autowired
    private CountAllService countAllService;
    @PostMapping("/AssociationList")
    @ResponseBody
    public AssociationRsp AssociationList(@RequestBody Page page){
        //检查权限
        AssociationRsp rsp = new AssociationRsp();
        Applets applets = new Applets();
        applets = appAppletsService.selectApplets();
        if("normal".equals(applets.getName())){
            rsp.setCode(201);
            rsp.setMsg("权限不足");
            return rsp;
        }
        List<Association> list;
        Page query = new Page();
        query.setStartPage((page.getStartPage()-1)* page.getPageSize());
        query.setPageSize(page.getPageSize());
        list = associationService.getAssociationList(query);
        int count = countAllService.countAssociation();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(count);
        return rsp;
    }

    @PostMapping("/DeleteAssociation")
    public BaseRsp DeleteAssociation(@RequestParam Integer id){

        associationService.deleteAssociationById(id);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }

    @PostMapping("/SearchAssociationById")
    public AssociationRsp SearchAssociationById(@RequestParam String name){

        List<Association> list;
        list = associationService.SearchAssociationById(name);
        AssociationRsp rsp  = new AssociationRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        rsp.setData(list);
        rsp.setCount(1);
        return rsp;
    }


    @PostMapping("/UpdateAssociation")
    public BaseRsp UpdateAssociation(@RequestBody Association association){

        if(association.getId() == null)
        {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            String dateName = df.format(calendar.getTime());
            association.setCreateTime(dateName);
            associationService.addAssociation(association);
        }
        associationService.UpdateAssociation(association);
        BaseRsp rsp = new BaseRsp();
        rsp.setCode(200);
        rsp.setMsg("success");
        return rsp;
    }
}

