package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

// this fails with:
//  Message: No bean of type [io.micronaut.core.cli.CommandLine] exists. Make sure the bean is not disabled by bean
//  requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then
//  ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java'
//  dependency should be configured as an annotation processor).
import spock.lang.Specification
@SpringBootTest
class ExampleSpec extends Specification {

    @Autowired
    MicronautService micronautService

    void "context loads correctly"() {
        expect:
        micronautService.random()
    }
}
