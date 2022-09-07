package com.zqg.communityManagementBackend.dto;

import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @creteTime: 2021/12/30 14:04
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AppBaseReq {
    @NotNull
    private String openId;
}
