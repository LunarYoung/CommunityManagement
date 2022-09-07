package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/21 16:03
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ArticleAndComment {
    // a.title,a.ass,a.id,a.type,a.time,c.name,c.content,c.status

    private String name;
    private String content;

    private Integer id;
    private Integer acId;
    private String ass;
    private String type;
    private String title;
    private String time;
    private String status;
}
