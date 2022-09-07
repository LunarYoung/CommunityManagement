package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Association;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/16 5:48
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AssociationRsp<T> extends BaseRsp {
    private List<Association> data;
    private Integer count;
}
