package com.zqg.communityManagementBackend.mapper;

/**
 * @creteTime: 2021/12/30 10:13
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */


import com.zqg.communityManagementBackend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> getList();
    void updateUser(User user);
    void insertAppId(String appId);
}
