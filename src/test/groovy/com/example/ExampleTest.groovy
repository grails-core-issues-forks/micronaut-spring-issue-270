package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test

@SpringBootTest
class ExampleTest {
    
    @Autowired
    MicronautService micronautService

    @Test
    void testItWorks() {
        expect:
        micronautService.random()
    }
}
