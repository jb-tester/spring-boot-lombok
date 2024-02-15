package com.mytests.spring.sb.constructorbinding;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 02.06.2021.</p>
 * <p>Project: spring-boot-constructorbinding</p>
 * *
 */
@ConfigurationProperties("dummy.buzz")
//@ConstructorBinding
@Data
public class ConstructorBindingConfigPropsWithLombok {

    /**
     * 'str' doc: constructorBinding, lombok.
     */
    @NonNull private String str;
   
    public String getProps(){
        return str;
    }
}
