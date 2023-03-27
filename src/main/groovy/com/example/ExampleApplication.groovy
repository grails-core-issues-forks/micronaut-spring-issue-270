package com.example

import io.micronaut.core.cli.CommandLine
import io.micronaut.spring.beans.MicronautBeanProcessor
import jakarta.inject.Singleton

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ExampleApplication {

    static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args)

//        SpringApplicationBuilder builder = new SpringApplicationBuilder();
//        MicronautApplicationContext context = new MicronautApplicationContext();
//        context.start();
//        builder.parent(context);
//        builder.sources(ExampleApplication);
//        builder.build().run();
    }

//    @Bean
//    MicronautBeanProcessor micronautBeanProcessor() {
//        return new MicronautBeanProcessor(Singleton.class, CommandLine.class)
//    }
}
