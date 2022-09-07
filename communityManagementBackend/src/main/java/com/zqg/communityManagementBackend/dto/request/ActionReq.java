package com.zqg.communityManagementBackend.dto.request;

import com.zqg.communityManagementBackend.dto.Page;
import lombok.Data;

/**
 * @creteTime: 2022/2/17 13:02
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ActionReq  {
    private String Status;
    private String ass;
    private String sort;
    private int startPage;
    private int pageSize;
}
