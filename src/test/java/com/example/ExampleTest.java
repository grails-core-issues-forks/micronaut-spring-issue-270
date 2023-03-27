package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExampleTest {

    @Autowired
    MicronautService micronautService;

    @Test
    void testItWorks() {
        assertEquals("", micronautService.random());
    }
}
