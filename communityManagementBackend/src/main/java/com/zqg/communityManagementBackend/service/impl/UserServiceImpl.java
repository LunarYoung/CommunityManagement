package  com.zqg.communityManagementBackend.service.impl;

import  com.zqg.communityManagementBackend.entity.User;
import  com.zqg.communityManagementBackend.mapper.UserMapper;
import  com.zqg.communityManagementBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 29123
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public void updateUser(User user ) {
         userMapper.updateUser(user);
    }

    @Override
    public void insertAppId(String appId) {
        userMapper.insertAppId(appId);
    }
}


