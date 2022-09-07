package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.entity.Pie;

import java.util.List;

/**
 * @creteTime: 2022/2/21 1:36
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface DashboardService {
    int countApply();
    int countPerson();
    int countArtComment();
    int countDusComment();
    int countArtView();
    int countDusView();
    int countGrade1();
    int countGrade2();
    int countGrade3();
    int countGrade4();
    List<Pie> countPie();
}
