package com.zqg.communityManagementBackend.entity;

import lombok.Data;
import org.springframework.data.relational.core.sql.In;

/**
 * @creteTime: 2022/2/20 23:22
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ArticleComment {
    private Integer articleId;
    private String name;
    private String avatarUrl;
    private String content;
    private Integer star;
    private String status;
}
