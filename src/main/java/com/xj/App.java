package com.xj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

//@ComponentScan(basePackages = {"com.xj.web","com.xj.dbconfig","com.xj.datasource" +
//        "","com.xj.service","com.xj.test2.service"})

@ComponentScan(basePackages = {"com.xj"})
@EnableAutoConfiguration
@MapperScan("com.xj.mapper")

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //启动springboot项目
        SpringApplication.run(App.class,args);

    }
}
