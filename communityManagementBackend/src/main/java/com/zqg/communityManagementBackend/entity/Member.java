package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/16 9:47
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Member {
    private Integer id;
    private String time;
    private String openId;
    private String name;
    private String ass;
    private String position;
    private String image;
    private String status;
    private String depart;
}
