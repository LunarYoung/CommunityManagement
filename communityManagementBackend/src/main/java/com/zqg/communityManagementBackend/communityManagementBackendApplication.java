package com.zqg.communityManagementBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 29123
 */
@SpringBootApplication
public class communityManagementBackendApplication {

    public static void main(String[] args) {
       // System.out.println(SpringApplication.class.getClassLoader().getResource("META-INF/spring.factories"));
     SpringApplication.run(communityManagementBackendApplication.class, args);
    }

}
