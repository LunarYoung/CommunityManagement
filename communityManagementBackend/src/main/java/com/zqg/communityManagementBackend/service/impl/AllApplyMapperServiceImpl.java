package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ApplyUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.QueryApplyReq;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.mapper.AllApplyMapper;
import com.zqg.communityManagementBackend.service.AllApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/15 8:20
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AllApplyMapperServiceImpl implements AllApplyService {
    @Autowired
    AllApplyMapper allApplyMapper;

    @Override
    public AllApply getForMember(Integer id) {
        return allApplyMapper.getForMember(id);
    }

    @Override
    public List<AllApply> getHistoryAllApplyList(Page page) {
        return allApplyMapper.getHistoryAllApplyList(page);
    }

    @Override
    public List<AllApply> getAllApplyList(Page page) {
        return allApplyMapper.getAllApplyList(page);
    }

    @Override
    public List<AllApply> queryMember(QueryApplyReq queryApplyReq) {
        return allApplyMapper.queryMember(queryApplyReq);
    }
    @Override
    public List<AllApply> queryHistoryMember(QueryApplyReq queryApplyReq) {
        return allApplyMapper.queryHistoryMember(queryApplyReq);
    }

    @Override
    public void addApply(AllApply allApply) {
        allApplyMapper.addApply(allApply);
    }

    @Override
    public void ApplyUpdateStatus(ApplyUpdateStatus applyUpdateStatus) {
        allApplyMapper.ApplyUpdateStatus(applyUpdateStatus);
    }
}
