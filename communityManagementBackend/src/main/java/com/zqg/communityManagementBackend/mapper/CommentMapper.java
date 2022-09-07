package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/20 2:40
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Repository
@Mapper
public interface CommentMapper {
    List<Comment> AllComment(Integer id);
    void addComment(Comment comment);
}
