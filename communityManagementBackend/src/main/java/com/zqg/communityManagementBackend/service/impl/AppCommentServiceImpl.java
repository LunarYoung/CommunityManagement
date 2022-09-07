package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.entity.Comment;
import com.zqg.communityManagementBackend.mapper.CommentMapper;
import com.zqg.communityManagementBackend.service.AppCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/20 2:44
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AppCommentServiceImpl implements AppCommentService {
    @Autowired
    CommentMapper commentMapper;
    @Override
    public List<Comment> AllComment(Integer id) {
        return commentMapper.AllComment(id);
    }

    @Override
    public void addComment(Comment comment) {
        commentMapper.addComment(comment);
    }
}
