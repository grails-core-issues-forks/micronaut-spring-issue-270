package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleTest {

    @Autowired
    MicronautService micronautService;

    @Test
    void testItWorks() {
        micronautService.random();
    }
}
