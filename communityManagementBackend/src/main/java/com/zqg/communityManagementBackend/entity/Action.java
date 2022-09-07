package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/17 8:47
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Action {
    private Integer id;
    private String name;
    private String time;
    private String timeLength;
    private String location;
    private String money;
    private String des;
    private String ass;
    private String sum;
    private String status;
}
