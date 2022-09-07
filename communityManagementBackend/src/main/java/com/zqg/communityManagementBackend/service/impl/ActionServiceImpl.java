package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ActionReq;
import com.zqg.communityManagementBackend.dto.request.ActionUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.PublicReq;
import com.zqg.communityManagementBackend.entity.*;
import com.zqg.communityManagementBackend.mapper.ActionMapper;
import com.zqg.communityManagementBackend.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/17 9:47
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class ActionServiceImpl implements ActionService {
    @Autowired
    ActionMapper actionMapper;
    @Override
    public void addAction(Action action) {
        actionMapper.addAction(action);
    }

    @Override
    public List<Action> queryAction(ActionReq actionReq) {
        return actionMapper.queryAction(actionReq);
    }

    @Override
    public void updateStatus(ActionUpdateStatus actionUpdateStatus) {
        actionMapper.updateStatus(actionUpdateStatus);
    }

    @Override
    public void addItem(Item item) {
        actionMapper.addItem(item);
    }

    @Override
    public List<String> getCol() {
        return actionMapper.getCol();
    }

    @Override
    public List<Public> queryPublic(PublicReq publicReq) {
        return actionMapper.queryPublic(publicReq);
    }

    @Override
    public int countPublic(PublicReq publicReq) {
        return actionMapper.countPublic(publicReq);
    }

    @Override
    public List<AllApply> queryNotice(String ass) {
        return actionMapper.queryNotice(ass);
    }

    @Override
    public void batchNotice(List<Notice> notices) {
        actionMapper.batchNotice(notices);
    }

    @Override
    public List<Notice> querySign(Page page) {
        return actionMapper.querySign(page);
    }
}
