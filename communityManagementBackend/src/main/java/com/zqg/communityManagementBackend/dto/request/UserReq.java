package com.zqg.communityManagementBackend.dto.request;

import com.zqg.communityManagementBackend.dto.AppBaseReq;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @creteTime: 2021/12/30 14:03
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class UserReq  extends AppBaseReq{
        private String name;
        private String sex;
        private String grade;
        private String depart;
        private String address;
        private Long phone;

}
