package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import com.zqg.communityManagementBackend.entity.ArticleAndComment;
import com.zqg.communityManagementBackend.entity.DusAndComment;

import java.util.List;

/**
 * @creteTime: 2022/2/21 16:07
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface CommentManageService {
    List<ArticleAndComment> commentManage(CommentManageReq commentManageReq);
    void upCAMstatus(Integer id);
    List<DusAndComment> commentManageDus(Page page);
    void upAAMstatus(Integer id);
}
