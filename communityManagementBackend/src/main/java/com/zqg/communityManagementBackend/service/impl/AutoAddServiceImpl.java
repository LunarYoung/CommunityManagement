package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.mapper.AutoAddMapper;
import com.zqg.communityManagementBackend.service.AutoAddSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @creteTime: 2022/2/20 4:43
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AutoAddServiceImpl implements AutoAddSerice {
    @Autowired
    AutoAddMapper autoAddMapper;
    @Override
    public void AuAddDusView(Integer id) {
        autoAddMapper.AuAddDusView(id);

    }

    @Override
    public void autoAddDusStar(Integer id) {
        autoAddMapper.autoAddDusStar(id);
    }

    @Override
    public void AuAddArticleView(Integer id) {
        autoAddMapper.AuAddArticleView(id);
    }

    @Override
    public void autoAddArticleStar(Integer id) {
        autoAddMapper.autoAddArticleStar(id);
    }
}
