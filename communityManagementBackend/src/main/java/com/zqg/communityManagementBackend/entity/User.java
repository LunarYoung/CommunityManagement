package com.zqg.communityManagementBackend.entity;

/**
 * @creteTime: 2021/12/30 10:12
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
import lombok.Data;

@Data
public class User {
    private Integer uniqueId;
    private String userAppId;
    private String name;
    private String sex;
    private String grade;
    private String depart;
    private String address;
    private Long phone;
}
