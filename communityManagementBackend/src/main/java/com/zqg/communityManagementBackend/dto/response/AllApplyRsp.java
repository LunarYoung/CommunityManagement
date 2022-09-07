package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.AllApply;

import com.zqg.communityManagementBackend.entity.Feedback;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/15 8:37
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AllApplyRsp<T> extends BaseRsp {
    private List<AllApply> data;
    private List<String> ass;
    private Integer count;
}

