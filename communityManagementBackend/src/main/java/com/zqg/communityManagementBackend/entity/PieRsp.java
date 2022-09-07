package com.zqg.communityManagementBackend.entity;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/21 3:02
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class PieRsp extends BaseRsp {
    List<Pie> pie;
}
