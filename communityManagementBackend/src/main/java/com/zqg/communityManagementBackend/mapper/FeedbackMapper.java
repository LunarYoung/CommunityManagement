package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2021/12/30 17:34
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

@Repository
@Mapper
public interface FeedbackMapper {
    void insertFeedback(Feedback feedback);
    List<Feedback> getFeedbackList(Page page);
}
