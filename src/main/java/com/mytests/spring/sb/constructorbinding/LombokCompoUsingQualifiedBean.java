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
        // type `some` here and invoke completion:
        // beans completion is expected, but doesn't appear
        // add one more @Component-annotated class - completion starts working
        // some
        return "LombokCompoUsingQualifiedBean{" +
               "bean1=" + bean1 +
               '}';
    }
}
