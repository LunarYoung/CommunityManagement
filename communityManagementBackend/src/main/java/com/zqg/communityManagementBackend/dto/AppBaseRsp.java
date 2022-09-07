package com.zqg.communityManagementBackend.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @creteTime: 2021/12/30 14:05
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
@Builder
public class AppBaseRsp {
    private Integer code;
    private String msg;
}
