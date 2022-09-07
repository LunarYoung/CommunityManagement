package com.zqg.communityManagementBackend.entity;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/21 2:19
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class DashboardGradeRsp extends BaseRsp {
    List list;
}
