package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @creteTime: 2022/1/7 17:05
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class CodeReq {
    @NotNull
    private String code;
}
