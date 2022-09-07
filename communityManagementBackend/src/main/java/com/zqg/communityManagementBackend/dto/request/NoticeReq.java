package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

/**
 * @creteTime: 2022/2/23 1:33
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class NoticeReq {
    private String item;
    private String time;
    private String ass;
    private String des;
    private String sign;
}
