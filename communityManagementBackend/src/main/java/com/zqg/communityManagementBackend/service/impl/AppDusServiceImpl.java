package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.entity.AppDus;
import com.zqg.communityManagementBackend.entity.AppDusDetail;
import com.zqg.communityManagementBackend.entity.AppDusRsp;
import com.zqg.communityManagementBackend.mapper.AppDusMapper;
import com.zqg.communityManagementBackend.service.AppDusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/19 9:53
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AppDusServiceImpl implements AppDusService {
    @Autowired
    AppDusMapper appDusMapper;
    @Override
    public void addAppDus(AppDus appDus) {
        appDusMapper.addAppDus(appDus);

    }

    @Override
    public List<AppDusDetail> queryAppDus(Integer sort) {
        return appDusMapper.queryAppDus(sort);
    }

    @Override
    public AppDusDetail appDusViewId(Integer id) {
        return appDusMapper.appDusViewId(id);
    }
}
