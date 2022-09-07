package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Public;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/21 21:14
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class PublicRsp extends BaseRsp {
    List<String > ass;
    List<String > item;
    List<Public> date;
    int count;
}
