package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ActionReq;
import com.zqg.communityManagementBackend.dto.request.ActionUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.PublicReq;
import com.zqg.communityManagementBackend.entity.*;

import java.util.List;

/**
 * @creteTime: 2022/2/17 9:46
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface ActionService {
    void addAction(Action action);
    List<Action> queryAction(ActionReq actionReq);
    void updateStatus(ActionUpdateStatus actionUpdateStatus);
    void addItem(Item item);
    List<String> getCol();
    List<Public> queryPublic(PublicReq publicReq);
    int countPublic(PublicReq publicReq);
    List<AllApply> queryNotice(String ass);
    void batchNotice(List<Notice> notices);
    List<Notice> querySign(Page page);
}
