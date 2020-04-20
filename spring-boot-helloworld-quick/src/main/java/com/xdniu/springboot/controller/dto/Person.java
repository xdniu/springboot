package com.xdniu.springboot.controller.dto;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.sql.DataSourceDefinition;
import java.util.List;
import java.util.Map;
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private String age;
    private List<String> list;
    private List<String> List1;
    private Map<String, String> maps;
    private Map<String, String> map1;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", list=" + list +
                ", List1=" + List1 +
                ", maps=" + maps +
                ", map1=" + map1 +
                '}';
    }
}
