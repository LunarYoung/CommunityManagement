package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/19 21:31
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AppDus {
    private Integer id;
    private String time;
    private String name;
    private String avatarUrl;
    private String title;
    private String content;
    private String url;
}
