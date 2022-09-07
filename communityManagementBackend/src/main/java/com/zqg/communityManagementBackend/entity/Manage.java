package com.zqg.communityManagementBackend.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @creteTime: 2022/2/23 21:15
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Manage {
    private String name;
    private String password;
}
