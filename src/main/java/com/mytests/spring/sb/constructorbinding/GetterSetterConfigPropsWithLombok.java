package com.mytests.spring.sb.constructorbinding;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dummy.boo")
@Getter
@Setter
public class GetterSetterConfigPropsWithLombok {

    /**
     * 'str' doc: getter+setter, lombok.
     */
    @NonNull
    private String str;

}
