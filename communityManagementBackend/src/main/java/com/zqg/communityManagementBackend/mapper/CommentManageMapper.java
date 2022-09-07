package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.dto.Page;
import com.zqg.communityManagementBackend.dto.request.CommentManageReq;
import com.zqg.communityManagementBackend.entity.ArticleAndComment;
import com.zqg.communityManagementBackend.entity.DusAndComment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/21 14:24
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface CommentManageMapper {
    List<ArticleAndComment> commentManage(CommentManageReq commentManageReq);
    void upCAMstatus(Integer id);
    void upAAMstatus(Integer id);

    List<DusAndComment> commentManageDus(Page page);
}
