package com.grope6.design;

import com.grope6.design.entity.Login;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Grope6DesignApplicationTests {

    @Autowired
    private Login login;

    @Test
    void contextLoads() {
        System.out.println(login.getUserid()+login.getUserpassword());
    }

}
