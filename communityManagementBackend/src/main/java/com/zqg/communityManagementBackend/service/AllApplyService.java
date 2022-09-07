package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ApplyUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.QueryApplyReq;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Feedback;

import java.util.List;

/**
 * @creteTime: 2022/2/15 8:21
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface AllApplyService {
    AllApply getForMember(Integer id);
    List<AllApply> getHistoryAllApplyList(Page page);
    List<AllApply> getAllApplyList(Page page);
    List<AllApply> queryMember(QueryApplyReq queryApplyReq);
    List<AllApply> queryHistoryMember(QueryApplyReq queryApplyReq);
    void addApply(AllApply allApply);
    void ApplyUpdateStatus(ApplyUpdateStatus applyUpdateStatus);
}
