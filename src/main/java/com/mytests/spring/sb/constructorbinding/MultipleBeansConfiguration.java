package com.mytests.spring.sb.constructorbinding;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleBeansConfiguration {


    @Bean("someBean11") //@Qualifier("b11")
    public Bean1 b11() {
        return new Bean1("b11");
    }
    @Bean("someBean12") //@Qualifier("b12")
    public Bean1 b12() {
        return new Bean1("b12");
    }
    @Bean("someBean13") //@Qualifier("b13")
    public Bean1 b13() {
        return new Bean1("b13");
    }

    @Bean
    public Bean2 someBean2() {
        return new Bean2("b2");
    }
}
