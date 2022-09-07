package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.request.ArticleReq;
import com.zqg.communityManagementBackend.entity.Applets;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/18 15:14
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AppIndexRsp {
    Applets img;
    List<ArticleReq> article;
}
