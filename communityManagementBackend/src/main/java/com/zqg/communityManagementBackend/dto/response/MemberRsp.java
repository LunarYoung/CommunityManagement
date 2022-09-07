package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.AllApply;
import com.zqg.communityManagementBackend.entity.Member;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/16 9:59
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class MemberRsp<T> extends BaseRsp {
    private List<Member> data;
    private List<String> ass;
    private Integer count;
}
