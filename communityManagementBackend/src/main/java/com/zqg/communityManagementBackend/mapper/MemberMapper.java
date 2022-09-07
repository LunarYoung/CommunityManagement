package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.MemberReq;
import com.zqg.communityManagementBackend.entity.Member;
import com.zqg.communityManagementBackend.entity.UpdateMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/16 9:45
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface MemberMapper {
    List<Member> getMemberList(Page page);
    List<String> getCol();
    List<Member> queryMember(MemberReq memberReq);
    void deleteMemberById(Integer id);
    void updateMemberById(UpdateMember updateMember);
    void insertMember(Member member);
}
