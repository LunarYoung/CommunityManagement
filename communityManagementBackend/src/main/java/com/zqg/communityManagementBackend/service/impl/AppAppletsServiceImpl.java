package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.entity.*;
import com.zqg.communityManagementBackend.mapper.AppAppletsMapper;
import com.zqg.communityManagementBackend.mapper.UserMapper;
import com.zqg.communityManagementBackend.service.AppAppletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2021/12/30 18:34
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Service
public class AppAppletsServiceImpl implements AppAppletsService {

    @Autowired
    AppAppletsMapper appAppletsMapper;

    @Override
    public void updateManage(String name) {
        appAppletsMapper.updateManage(name);
    }

    @Override
    public String confirmManage(String name) {
        return appAppletsMapper.confirmManage(name);
    }

    @Override
    public List<Manage> selectManage() {
        return appAppletsMapper.selectManage();
    }

    @Override
    public void addManage(Manage manage) {
        appAppletsMapper.addManage(manage);
    }

    @Override
    public void deleteManage(String name) {
        appAppletsMapper.deleteManage(name);
    }

    @Override
    public void updateApplets(Applets applets) {
          appAppletsMapper.updateApplets(applets);
    }

    @Override
    public Applets selectApplets() {
        return appAppletsMapper.selectApplets();
    }

    @Override
    public List<Member> selectMyCom(String openId) {
        return appAppletsMapper.selectMyCom(openId);
    }

    @Override
    public List<AllApply> selectMyApply(String openId) {
        return appAppletsMapper.selectMyApply(openId);
    }

    @Override
    public void updateMyCom(MyCom myCom) {
        appAppletsMapper.updateMyCom(myCom);
    }

    @Override
    public void addPublic(Public p) {
        appAppletsMapper.addPublic(p);
    }

    @Override
    public void sign(Integer id) {
        appAppletsMapper.sign(id);
    }


}



