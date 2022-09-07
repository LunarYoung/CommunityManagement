package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.dto.response.AppViewArticleRsp;
import com.zqg.communityManagementBackend.entity.ArticleComment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/18 5:36
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface ArticleMapper {
     void addArticle(ArticleReq articleReq);
     void deleteId(Integer id);
     List<ArticleReq> getArticleList(Page page);
     String  viewId(Integer id);
     ArticleReq appViewId(Integer id);
     List<ArticleComment> articleComment(Integer id);
     void addArticleComment(ArticleComment articleComment);
}
