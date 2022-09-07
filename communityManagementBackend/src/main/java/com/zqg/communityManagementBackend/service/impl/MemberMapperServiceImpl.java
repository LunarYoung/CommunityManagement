package com.zqg.communityManagementBackend.service.impl;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.MemberReq;
import com.zqg.communityManagementBackend.entity.Member;
import com.zqg.communityManagementBackend.entity.UpdateMember;
import com.zqg.communityManagementBackend.mapper.MemberMapper;
import com.zqg.communityManagementBackend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @creteTime: 2022/2/16 9:46
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Service
public class MemberMapperServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;
    @Override
    public List<Member> getMemberList(Page page) {
        return memberMapper.getMemberList(page);
    }

    @Override
    public List<String> getCol() {
        return memberMapper.getCol();
    }

    @Override
    public List<Member> queryMember(MemberReq memberReq) {
        return memberMapper.queryMember(memberReq);
    }

    @Override
    public void deleteMemberById(Integer id) {
        memberMapper.deleteMemberById(id);
    }

    @Override
    public void updateMemberById(UpdateMember updateMember) {
        memberMapper.updateMemberById(updateMember);
    }

    @Override
    public void insertMember(Member member) {
        memberMapper.insertMember(member);
    }
}
