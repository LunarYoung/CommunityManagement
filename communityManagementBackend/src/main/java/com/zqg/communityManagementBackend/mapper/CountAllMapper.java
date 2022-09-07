package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lunaryoung
 */
@Repository
@Mapper
public interface CountAllMapper {
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
