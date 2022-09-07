package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.entity.*;

import java.util.List;

/**
 * @creteTime: 2021/12/30 18:33
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface AppAppletsService {
    void updateManage(String name);
    String confirmManage(String name);
    List<Manage> selectManage();
    void addManage(Manage manage);
    void deleteManage(String name);
    void updateApplets(Applets applets);
    Applets selectApplets();
    List<Member> selectMyCom(String openId);
    List<AllApply> selectMyApply(String openId);
    void updateMyCom(MyCom myCom);
    void addPublic(Public p);
    void sign(Integer id);
}
