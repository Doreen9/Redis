package io.turntabl.springbootdemo.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MathsTest {

    @Test
    void addPositiveNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(10, 9);
        assertEquals(19, sum);
    }
    @Test
    void addNegativeNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(-10, -9);
        assertEquals(-19, sum);
    }
    @Test
    void addNegativePositiveNumbers() {
        Maths result = new Maths();
        Integer sum = result.addNumbers(-10, 9);
        assertEquals(-1, sum);
    }

    @Test
    void subtractPositiveNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(10, 9);
        assertEquals(1, difference);
    }

    @Test
    void subtractNegativeNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(-10, -9);
        assertEquals(-1, difference);
    }
    @Test
    void subtractNegativePositiveNumbers() {
        Maths result = new Maths();
        Integer difference = result.subtractNumbers(-10, 9);
        assertEquals(-19, difference);
    }
}