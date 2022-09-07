package com.zqg.communityManagementBackend.entity;

import lombok.Data;
import org.springframework.data.relational.core.sql.In;

/**
 * @creteTime: 2022/2/21 21:53
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Public {
    private Integer id;
    private String item;
    private String name;
    private String sex;
    private String photo;
    private String depart;
    private String ass;
    private String grade;
    private String time;
}
