package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.Feedback;

import java.util.List;

/**
 * @creteTime: 2021/12/30 17:31
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface FeedbackService {

        void insertFeedback(Feedback feedback);

        List<Feedback> getFeedbackList(Page page);



}
