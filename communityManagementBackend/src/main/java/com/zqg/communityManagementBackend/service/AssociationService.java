package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Association;
import com.zqg.communityManagementBackend.entity.User;

import java.util.List;

/**
 * @creteTime: 2022/2/16 5:37
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface AssociationService {
    List<Association> getAssociationList(Page page);
    void deleteAssociationById(Integer id);
    List<Association> SearchAssociationById(String name);
    void UpdateAssociation(Association association);
    void addAssociation(Association association);
}
