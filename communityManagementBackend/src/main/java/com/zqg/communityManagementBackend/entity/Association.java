package com.zqg.communityManagementBackend.entity;

import lombok.Data;

/**
 * @creteTime: 2022/2/16 5:37
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class Association {
    private Integer id;
    private String createTime;
    private String name;
    private Integer sum;
    private Integer maxSum;
    private String status;
    private String leader;
    private String introduce;
    private String timestamp;
}
