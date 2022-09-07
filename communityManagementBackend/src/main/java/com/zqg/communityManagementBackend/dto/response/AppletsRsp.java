package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Applets;
import lombok.Data;

@Data
public class AppletsRsp extends BaseRsp {
    private Applets data;
}
