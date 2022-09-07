package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ApplyUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.QueryApplyReq;
import com.zqg.communityManagementBackend.entity.AllApply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/15 8:19
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AllApplyMapper {
    AllApply getForMember(Integer id);
    List<AllApply> getAllApplyList(Page page);
    List<AllApply> getHistoryAllApplyList(Page page);
    List<AllApply> queryMember(QueryApplyReq queryApplyReq);
    List<AllApply> queryHistoryMember(QueryApplyReq queryApplyReq);
    void ApplyUpdateStatus(ApplyUpdateStatus applyUpdateStatus);
    void addApply(AllApply allApply);

}
