package com.mytests.spring.sb.constructorbinding;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ValueLombok {

    @Value("${value.id}")
    String id;

    @Override
    public String toString() {
        return "ValueLombok{" +
                "id='" + id + '\'' +
                '}';
    }
}
