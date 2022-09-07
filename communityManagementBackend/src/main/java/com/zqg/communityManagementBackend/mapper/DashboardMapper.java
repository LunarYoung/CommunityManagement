package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.entity.Pie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/21 1:35
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface DashboardMapper {
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
