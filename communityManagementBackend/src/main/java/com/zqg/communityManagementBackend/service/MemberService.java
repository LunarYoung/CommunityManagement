package com.zqg.communityManagementBackend.service;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.MemberReq;
import com.zqg.communityManagementBackend.entity.Member;
import com.zqg.communityManagementBackend.entity.UpdateMember;

import java.util.List;

/**
 * @creteTime: 2022/2/16 9:46
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
public interface MemberService {
    List<Member> getMemberList(Page page);
    List<String> getCol();
    List<Member> queryMember(MemberReq memberReq);
    void deleteMemberById(Integer id);
    void updateMemberById(UpdateMember updateMember);
    void insertMember(Member member);
}
