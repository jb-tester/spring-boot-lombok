package com.mytests.spring.sb.constructorbinding;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 02.06.2021.</p>
 * <p>Project: spring-boot-constructorbinding</p>
 * *
 */
@ConfigurationProperties("foo.bar")
//@ConstructorBinding
public class MyConfigProps {
     String str1;
     String str2;
    public MyConfigProps(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    
    public String getProps() {
        return str1+" "+str2;
    }
}
