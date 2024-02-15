package com.mytests.spring.sb.constructorbinding;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LombokCompoUsingQualifiedBean {


    @Qualifier("b13")
    private final Bean1 bean1;

    @Override
    public String toString() {
        return "LombokCompoUsingQualifiedBean{" +
               "bean1=" + bean1 +
               '}';
    }
}
