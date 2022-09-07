package com.zqg.communityManagementBackend.entity;

import lombok.Data;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

/**
 * @creteTime: 2021/12/31 14:53
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Data
//{
//    roles: ['admin'],
//    introduction: 'I am a super administrator',
//    avatar: 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif',
//    name: 'Super Admin'
//  },
public class Role {
     private String roles;
     private String introduction;
     private String avatar;
     private String name;
     private Integer code;
     private String token;
}
