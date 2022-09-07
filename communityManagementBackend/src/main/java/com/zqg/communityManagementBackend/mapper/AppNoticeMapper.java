package com.zqg.communityManagementBackend.mapper;

import com.zqg.communityManagementBackend.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @creteTime: 2022/2/23 12:58
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Repository
@Mapper
public interface AppNoticeMapper {
    List<Notice> appNotice(String id);
}
