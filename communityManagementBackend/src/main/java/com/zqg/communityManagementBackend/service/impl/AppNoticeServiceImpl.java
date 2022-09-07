package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.entity.Notice;
import com.zqg.communityManagementBackend.mapper.AppNoticeMapper;
import com.zqg.communityManagementBackend.service.AppNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/23 13:09
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AppNoticeServiceImpl implements AppNoticeService {
    @Autowired
    AppNoticeMapper appNoticeMapper;
    @Override
    public List<Notice> appNotice(String id) {
        return appNoticeMapper.appNotice(id);
    }
}
