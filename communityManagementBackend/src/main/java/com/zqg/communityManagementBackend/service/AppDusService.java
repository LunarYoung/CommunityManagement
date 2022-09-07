package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.entity.AppDus;
import com.zqg.communityManagementBackend.entity.AppDusDetail;
import com.zqg.communityManagementBackend.entity.AppDusRsp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/19 9:53
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

public interface AppDusService {
    void addAppDus(AppDus appDus);
    List<AppDusDetail> queryAppDus(Integer sort);
    AppDusDetail appDusViewId(Integer id);
}
