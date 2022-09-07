package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.DusAndComment;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

/**
 * @creteTime: 2022/2/21 18:47
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
public class CommentManageDusRsp extends BaseRsp {
   List<DusAndComment> DusAndComment;
   private Integer count;
}
