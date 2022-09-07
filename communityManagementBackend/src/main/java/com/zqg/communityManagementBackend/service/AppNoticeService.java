package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.entity.Notice;

import java.util.List;

/**
 * @creteTime: 2022/2/23 13:08
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface AppNoticeService {
    List<Notice> appNotice(String id);
}
