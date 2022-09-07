package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Action;
import com.zqg.communityManagementBackend.entity.AllApply;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/17 13:07
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ActionRsp extends BaseRsp {
    private List<Action> data;
    private List<String> ass;
    private Integer count;
}
