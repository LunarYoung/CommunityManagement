package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

/**
 * @creteTime: 2022/2/16 17:20
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class MemberReq {
    private String name;
    private String ass;
    private String position;
    private String sort;
    private String page;
}
