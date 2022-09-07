package com.zqg.communityManagementBackend.dto.request;

import lombok.Data;

/**
 * @creteTime: 2022/2/21 21:29
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class PublicReq {
    private String ass ;
    private String  item ;
    private Integer pageSize;
    private String  sex;
    private Integer sort ;
    private Integer startPage ;
}
