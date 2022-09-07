package com.zqg.communityManagementBackend;


import com.zqg.communityManagementBackend.entity.User;
import com.zqg.communityManagementBackend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunitymanagementbackendApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void getList(){
        List<User> list = userService.getList();
        System.out.println(list.toString());
    }

}
