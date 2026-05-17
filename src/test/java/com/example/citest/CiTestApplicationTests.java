package com.example.citest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiTestApplicationTests {

    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void test2App() {
        assertEquals(2, 2);
    }

}
