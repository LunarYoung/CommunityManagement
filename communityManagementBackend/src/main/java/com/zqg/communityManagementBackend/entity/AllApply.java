package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/15 8:24
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AllApply {
    private Integer id;
    private String sex;
    private String applyTime;
    private String name;
    private String phone;
    private String depart;
    private String applyAssociation;
    private String status;
    private String openId;
    private String examine;
    private String introduce;
    private String image;

}
