package com.mytests.spring.sb.constructorbinding;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LombokCompoUsingQualifiedBean {

    // qualifier is not suggested by autowire intention
    @Qualifier("someBean11")
    private final Bean1 bean1;

    @Override
    public String toString() {
        return "LombokCompoUsingQualifiedBean{" +
               "bean1=" + bean1 +
               '}';
    }
}
