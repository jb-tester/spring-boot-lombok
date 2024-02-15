package com.mytests.spring.sb.constructorbinding;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleBeansConfiguration {


    @Bean("b11") //@Qualifier("b11")
    public Bean1 b11() {
        return new Bean1("b11");
    }
    @Bean("b12") //@Qualifier("b12")
    public Bean1 b12() {
        return new Bean1("b12");
    }
    @Bean("b13") //@Qualifier("b13")
    public Bean1 b13() {
        return new Bean1("b13");
    }
}
