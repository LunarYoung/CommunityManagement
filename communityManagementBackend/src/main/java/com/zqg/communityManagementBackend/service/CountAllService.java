package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.request.CommentManageReq;

public interface CountAllService {
    int countFeedback();
    int countAllApply();
    int countAssociation();
    int countMember();
    int  countAction();
    int countArticle();
    int countCommentManageDus();
    int countNotice();
    int countCommentManage(CommentManageReq commentManageReq);
}
