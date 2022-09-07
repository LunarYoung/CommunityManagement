package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.entity.AppDus;
import com.zqg.communityManagementBackend.entity.AppDusDetail;
import com.zqg.communityManagementBackend.entity.AppDusRsp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/19 9:53
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AppDusMapper {
    void addAppDus(AppDus appDus);
    List<AppDusDetail> queryAppDus(Integer sort);
    AppDusDetail appDusViewId(Integer id);
}
