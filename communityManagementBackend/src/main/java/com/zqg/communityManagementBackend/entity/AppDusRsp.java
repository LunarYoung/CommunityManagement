package com.zqg.communityManagementBackend.entity;

import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/19 22:18
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class AppDusRsp {
    AppDusDetail AppDusDetail;
    List<Comment> commentList;
}
