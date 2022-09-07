package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.dto.response.ArticleRsp;
import com.zqg.communityManagementBackend.entity.ArticleComment;
import com.zqg.communityManagementBackend.mapper.ArticleMapper;
import com.zqg.communityManagementBackend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/18 5:40
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public void addArticle(ArticleReq articleReq) {
        articleMapper.addArticle(articleReq);
    }

    @Override
    public List<ArticleReq> getArticleList(Page page) {
        return articleMapper.getArticleList(page);
    }

    @Override
    public void deleteId(Integer id) {
        articleMapper.deleteId(id);
    }

    @Override
    public String viewId(Integer id) {
        return articleMapper.viewId(id);
    }

    @Override
    public ArticleReq appViewId(Integer id) {
        return articleMapper.appViewId(id);
    }

    @Override
    public List<ArticleComment> articleComment(Integer id) {
        return articleMapper.articleComment(id);
    }

    @Override
    public void addArticleComment(ArticleComment articleComment) {
        articleMapper.addArticleComment(articleComment);
    }
}
