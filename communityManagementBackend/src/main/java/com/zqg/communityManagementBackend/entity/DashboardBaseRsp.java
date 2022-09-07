package com.zqg.communityManagementBackend.entity;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import lombok.Data;

/**
 * @creteTime: 2022/2/21 1:33
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class DashboardBaseRsp extends BaseRsp {
    private Integer person;
    private Integer view;
    private Integer apply;
    private Integer comment;
}
