package com.shp.mytibbar;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.shp.mytibbar.mapper")
@SpringBootApplication
public class MytibbarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytibbarApplication.class, args);

//        ApplicationContext context = SpringApplication.run(MytibbarApplication.class, args);
//
//        Binder binder = Binder.get(context.getEnvironment());
//
//
//        // 绑定List配置
//        List<String> post = binder.bind("com.didispace.post", Bindable.listOf(String.class)).get();
//        System.out.println(post);
    }

}
