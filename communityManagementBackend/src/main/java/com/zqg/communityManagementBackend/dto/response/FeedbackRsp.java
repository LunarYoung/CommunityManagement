package com.zqg.communityManagementBackend.dto.response;

import com.zqg.communityManagementBackend.dto.BaseRsp;
import com.zqg.communityManagementBackend.entity.Feedback;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import java.util.List;
@Data
public class FeedbackRsp<T> extends BaseRsp {
    private List<Feedback> data;
    private Integer count;
}
