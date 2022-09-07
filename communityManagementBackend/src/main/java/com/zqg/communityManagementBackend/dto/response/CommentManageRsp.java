package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.ArticleAndComment;
import lombok.Data;

import java.util.Base64;
import java.util.List;

/**
 * @creteTime: 2022/2/21 15:55
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class CommentManageRsp extends BaseRsp {
    private List<ArticleAndComment> AAC;
    private List<String> ass;
    private Integer count;
}
