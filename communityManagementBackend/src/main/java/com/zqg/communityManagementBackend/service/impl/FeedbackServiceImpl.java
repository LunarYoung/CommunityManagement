package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.Feedback;
import com.zqg.communityManagementBackend.entity.User;
import com.zqg.communityManagementBackend.mapper.FeedbackMapper;
import com.zqg.communityManagementBackend.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2021/12/30 17:31
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedbackMapper feedbackMapper;
    @Override
    public void insertFeedback(Feedback feedback) {
        feedbackMapper.insertFeedback(feedback);
    }

    @Override
    public List<Feedback> getFeedbackList(Page page) {
        return feedbackMapper.getFeedbackList(page);
    }
}
