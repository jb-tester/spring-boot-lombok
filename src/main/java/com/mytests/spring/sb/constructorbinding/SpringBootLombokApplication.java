package com.mytests.spring.sb.constructorbinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({MyConfigProps.class, ConstructorBindingConfigPropsWithLombok.class, GetterSetterConfigPropsWithLombok.class})
public class SpringBootLombokApplication implements CommandLineRunner {

    public SpringBootLombokApplication(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLombokApplication.class, args);
    }
     final
     ApplicationContext ctx;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(ctx.getBean(MyConfigProps.class).getProps());
        System.out.println(ctx.getBean(ConstructorBindingConfigPropsWithLombok.class).getProps());
        System.out.println(ctx.getBean(GetterSetterConfigPropsWithLombok.class).getStr());
        System.out.println(ctx.getBean(ValueLombok.class));
        System.out.println("**********************************");
    }
}
