package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.entity.Pie;
import com.zqg.communityManagementBackend.mapper.DashboardMapper;
import com.zqg.communityManagementBackend.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/21 1:36
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    DashboardMapper dashboardMapper;
    @Override
    public int countApply() {
        return dashboardMapper.countApply() ;
    }

    @Override
    public int countPerson() {
        return dashboardMapper.countPerson();
    }

    @Override
    public int countArtComment() {
        return dashboardMapper.countArtComment();
    }

    @Override
    public int countDusComment() {
        return dashboardMapper.countDusComment();
    }

    @Override
    public int countArtView() {
        return dashboardMapper.countArtView();
    }

    @Override
    public int countDusView() {
        return dashboardMapper.countDusView();
    }

    @Override
    public int countGrade1() {
        return dashboardMapper.countGrade1();
    }

    @Override
    public int countGrade2() {
        return dashboardMapper.countGrade2();
    }

    @Override
    public int countGrade3() {
        return dashboardMapper.countGrade3();
    }

    @Override
    public int countGrade4() {
        return dashboardMapper.countGrade4();
    }

    @Override
    public List<Pie> countPie() {
        return dashboardMapper.countPie();
    }
}
