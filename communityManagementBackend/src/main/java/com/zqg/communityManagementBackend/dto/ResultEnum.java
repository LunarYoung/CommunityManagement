package com.zqg.communityManagementBackend.dto;

/**
 * @creteTime: 2021/12/30 11:45
 * @author: lunarYoung
 * @version: v 1.0
 * @Description: 返回结果枚举
 */

import lombok.Getter;
@Getter
public enum ResultEnum {

    SUCCESS(200, "操作成功！"),
    ERROR(500, "内部异常，稍后操作！"),
    DATA_NOT_FOUND(401, "查询失败！"),
    PARAMS_NULL(402, "参数不能为空！"),
    PARAMS_ERROR(405, "参数不合法！"),
    NOT_LOGIN(403, "当前账号未登录！")
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
