package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Association;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**getAssociationList
 * @creteTime: 2022/2/16 5:37
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AssociationMapper {
    List<Association> getAssociationList(Page page);
    Integer deleteAssociationById(Integer id);
    List<Association> SearchAssociationById(String name);
    void UpdateAssociation(Association association);
    void addAssociation(Association association);

}
