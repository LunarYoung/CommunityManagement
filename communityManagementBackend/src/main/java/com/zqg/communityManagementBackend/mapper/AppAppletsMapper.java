package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2021/12/30 18:34
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AppAppletsMapper {
    void updateManage(String name);
    String confirmManage(String name);
    void updateApplets(Applets applets);
    void addManage(Manage manage);
    void deleteManage(String name);
    List<Manage> selectManage();
    Applets selectApplets();
    List<Member> selectMyCom(String openId);
    void updateMyCom(MyCom myCom);
    void addPublic(Public p);
    void sign(Integer id);
    List<AllApply> selectMyApply(String openId);
}
