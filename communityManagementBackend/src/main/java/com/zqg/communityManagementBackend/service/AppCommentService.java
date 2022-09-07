package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.entity.Comment;

import java.util.List;

/**
 * @creteTime: 2022/2/20 2:44
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface AppCommentService {
    List<Comment> AllComment(Integer id);
    void addComment(Comment comment);
}
