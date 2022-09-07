package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import com.zqg.communityManagementBackend.entity.ArticleAndComment;
import com.zqg.communityManagementBackend.entity.DusAndComment;
import com.zqg.communityManagementBackend.mapper.CommentManageMapper;
import com.zqg.communityManagementBackend.service.CommentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/21 16:08
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class CommentManageServiceImpl implements CommentManageService {
    @Autowired
    CommentManageMapper commentManageMapper;
    @Override
    public List<ArticleAndComment> commentManage(CommentManageReq commentManageReq) {
        return commentManageMapper.commentManage(commentManageReq);
    }

    @Override
    public void upCAMstatus(Integer id) {
        commentManageMapper.upCAMstatus(id);
    }

    @Override
    public List<DusAndComment> commentManageDus(Page page) {
        return commentManageMapper.commentManageDus(page);
    }

    @Override
    public void upAAMstatus(Integer id) {
        commentManageMapper.upAAMstatus(id);
    }
}
