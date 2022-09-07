package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.entity.AllApply;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/18 6:34
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ArticleRsp extends BaseRsp {
    private List<ArticleReq> data;
    private  Integer count;
}
