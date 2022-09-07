package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinitions;

/**
 * @creteTime: 2022/2/18 5:27
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ArticleReq {
    private Integer id;
    private Integer star;
    private Integer view;
    private String ass;
    private String type;
    private String title;
    private String content;
    private String time;
    private String status;
}
