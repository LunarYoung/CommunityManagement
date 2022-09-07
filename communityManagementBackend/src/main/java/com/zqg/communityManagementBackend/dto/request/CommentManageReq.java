package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

/**
 * @creteTime: 2022/2/21 15:33
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class CommentManageReq {
    private String title;
    private String ass;
    private String type;
    private Integer startPage;
    private Integer pageSize;
}
