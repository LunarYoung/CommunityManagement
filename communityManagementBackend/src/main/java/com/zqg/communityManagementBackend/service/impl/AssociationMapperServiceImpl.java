package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Association;
import com.zqg.communityManagementBackend.mapper.AllApplyMapper;
import com.zqg.communityManagementBackend.mapper.AssociationMapper;
import com.zqg.communityManagementBackend.service.AllApplyService;
import com.zqg.communityManagementBackend.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/16 5:37
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class AssociationMapperServiceImpl implements AssociationService {
    @Autowired
    AssociationMapper associationMapper;
    @Override
    public List<Association> getAssociationList(Page page) {
        return associationMapper.getAssociationList(page);
    }
    @Override
    public void deleteAssociationById(Integer id)
    {
       associationMapper.deleteAssociationById(id);
    }

    @Override
    public  List<Association> SearchAssociationById(String name) {
       return associationMapper.SearchAssociationById(name);
    }

    @Override
    public void UpdateAssociation(Association association) {
        associationMapper.UpdateAssociation(association);
    }

    @Override
    public void addAssociation(Association association) {
        associationMapper.addAssociation(association);
    }


}
