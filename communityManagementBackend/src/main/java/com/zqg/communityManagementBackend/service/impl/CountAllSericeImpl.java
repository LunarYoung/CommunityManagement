package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import com.zqg.communityManagementBackend.mapper.CountAllMapper;
import com.zqg.communityManagementBackend.service.CountAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lunaryoung
 */
@Service
public class CountAllSericeImpl implements CountAllService {
    @Autowired
    CountAllMapper countAllMapper;

    @Override
    public int countFeedback() {
        return countAllMapper.countFeedback();
    }

    @Override
    public int countAllApply() {
        return countAllMapper.countAllApply();
    }

    @Override
    public int countAssociation() {
        return countAllMapper.countAssociation();
    }

    @Override
    public int countMember() {
        return countAllMapper.countMember();
    }

    @Override
    public int countAction() {
        return countAllMapper.countAction();
    }
    @Override
    public int countArticle() {
        return countAllMapper.countArticle();
    }

    @Override
    public int countCommentManageDus() {
        return countAllMapper.countCommentManageDus();
    }

    @Override
    public int countNotice() {
        return countAllMapper.countNotice();
    }

    @Override
    public int countCommentManage(CommentManageReq commentManageReq) {
        return countAllMapper.countCommentManage(commentManageReq);
    }
}
