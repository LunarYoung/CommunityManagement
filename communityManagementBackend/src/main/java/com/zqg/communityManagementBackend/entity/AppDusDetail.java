package com.zqg.communityManagementBackend.entity;

import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/20 2:51
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AppDusDetail {
    private Integer id;
    private String time;
    private String name;
    private String avatarUrl;
    private String title;
    private String content;
    private String url;
    private Integer star;
    private Integer viewD;
    private Integer comment;
}