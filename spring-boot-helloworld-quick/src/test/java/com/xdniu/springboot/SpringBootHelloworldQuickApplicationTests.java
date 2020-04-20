package com.xdniu.springboot;

import com.xdniu.springboot.controller.dto.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootHelloworldQuickApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        person.toString();
        System.out.println(person);
    }

}
