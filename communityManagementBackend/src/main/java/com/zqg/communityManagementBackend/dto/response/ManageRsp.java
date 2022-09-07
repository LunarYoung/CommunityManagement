package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Manage;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/23 21:24
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ManageRsp extends BaseRsp {
   List<Manage> manage;
}
