package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/23 1:39
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Notice {
    private Integer id;
    private String item;
    private String des;
    private String open_id;
    private String name;
    private String time;
    private String depart;
    private String phone;
    private String sign;
}
