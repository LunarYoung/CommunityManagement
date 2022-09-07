package com.zqg.communityManagementBackend.service;

/**
 * @creteTime: 2021/12/30 10:14
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */

import com.zqg.communityManagementBackend.entity.User;
import java.util.List;

public interface UserService {
    List<User> getList();
    void updateUser(User user);
    void insertAppId(String appId);
}
