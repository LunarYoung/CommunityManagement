package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Notice;
import lombok.Data;

import java.util.Base64;
import java.util.List;

/**
 * @creteTime: 2022/2/23 2:17
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class NoticeRsp extends BaseRsp {
    List<Notice> data;
    int count;
}
