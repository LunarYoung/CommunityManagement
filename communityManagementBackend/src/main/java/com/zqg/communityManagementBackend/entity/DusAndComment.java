package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/21 19:05
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class DusAndComment {
    // a.c_id,a.name,a.content,a.time,a.url,c.content,c.name,c.status
    private Integer cId;
    private String name1;
    private String content1;
    private String time;
    private String url;
    private String name;
    private String content;
    private String status;

}
