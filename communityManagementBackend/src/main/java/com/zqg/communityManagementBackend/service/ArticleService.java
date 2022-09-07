package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.dto.response.ArticleRsp;
import com.zqg.communityManagementBackend.entity.ArticleComment;

import java.util.List;

/**
 * @creteTime: 2022/2/18 5:40
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface ArticleService {
    void addArticle(ArticleReq articleReq);
    List<ArticleReq> getArticleList(Page page);
    void deleteId(Integer id);
    String  viewId(Integer id);
    ArticleReq appViewId(Integer id);
    List<ArticleComment> articleComment(Integer id);
    void addArticleComment(ArticleComment articleComment);
}
