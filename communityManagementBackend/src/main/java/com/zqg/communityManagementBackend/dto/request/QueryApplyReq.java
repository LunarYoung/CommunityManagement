package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

/**
 * @creteTime: 2022/2/17 6:27
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class QueryApplyReq {
    private String ass;
    private String name;
    private String sex;
    private String sort;
}
