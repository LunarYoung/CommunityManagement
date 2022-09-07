package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.ActionReq;
import com.zqg.communityManagementBackend.dto.request.ActionUpdateStatus;
import com.zqg.communityManagementBackend.dto.request.PublicReq;
import com.zqg.communityManagementBackend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/17 9:40
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface ActionMapper {
    void addAction(Action action);
    void updateStatus(ActionUpdateStatus actionUpdateStatus);
    List<Action> queryAction(ActionReq actionReq);
    void addItem(Item item);
    List<String> getCol();
    List<Public> queryPublic(PublicReq publicReq);
    int countPublic(PublicReq publicReq);

     List<AllApply> queryNotice(String ass);
     void batchNotice(List<Notice> notices);
     List<Notice> querySign(Page page);
}
