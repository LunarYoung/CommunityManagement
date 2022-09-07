package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/11 23:00
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class MyApply {
    private String name;
    private String openId;
    private String applyName;
    private Integer status;
}
