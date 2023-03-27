package com.example

import io.micronaut.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.micronaut.spring.beans.MicronautBeanProcessor

@Configuration
class ByAnnotationTypeConfig {

    @Bean
    MicronautBeanProcessor beanProcessor() {
        new MicronautBeanProcessor(Singleton)
    }
}
