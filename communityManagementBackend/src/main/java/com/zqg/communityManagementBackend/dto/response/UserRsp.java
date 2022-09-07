package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import lombok.Data;

/**
 * @creteTime: 2021/12/30 11:55
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class UserRsp extends BaseRsp {
    private String userAppId;
    private int uniqueId;
    private String name;
    private String sex;
    private int grade;
    private String depart;
    private String address;
    private int phone;
}
