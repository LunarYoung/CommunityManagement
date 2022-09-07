package com.zqg.communityManagementBackend.dto.response;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.zqg.communityManagementBackend.dto.BaseRsp;
import lombok.Data;

import java.util.List;

/**
 * @creteTime: 2022/2/18 5:12
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class ArticleBaseRsp extends BaseRsp {
    List<String> ass;

}
