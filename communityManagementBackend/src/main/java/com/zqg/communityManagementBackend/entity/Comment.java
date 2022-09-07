package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/20 2:38
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Comment {
    private Integer dusId;
    private String name;
    private String avatarUrl;
    private String content;
    private String status;
    private Integer star;

}
