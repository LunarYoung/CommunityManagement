package com.zqg.communityManagementBackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

/**
 * @creteTime: 2022/2/20 4:43
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AutoAddMapper {
   void AuAddDusView(Integer id);
   void autoAddDusStar(Integer id);
   void AuAddArticleView(Integer id);
   void autoAddArticleStar(Integer id);


}
