package fmi.math;

import fmi.math.MyMath;
import org.junit.jupiter.api.*;

import java.security.spec.ECPoint;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private static final double EPSILON = 1e-10;

    @BeforeAll
    static void setup() {
        System.out.printf("tests starting%n");
    }

    @AfterAll
    static void tear() {
        System.out.printf("tests ending%n");
    }

    // using lambda to create Executable
    @Test
    @DisplayName("power raise timeout test")
    void integerPowTest() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> { MyMath.integerPow(2.5, 4);});
    }

    @Test
    @DisplayName("sqrt a negative")
    void sqrtTestOne() {
        assertThrows(IllegalArgumentException.class, () -> {MyMath.sqrt(-256);});
    }

    @Test
    @DisplayName("sqrt a positive")
    void sqrtTestTwo() {
        assertEquals(16, MyMath.sqrt(256), EPSILON);
    }

    @Test
    void radiansToDegreesTestOne() {
        assertEquals(180, MyMath.radiansToDegrees(MyMath.PI), EPSILON);
    }

    @Test
    void radiansToDegreesTestTwo() {
        assertEquals(MyMath.PI, MyMath.degreesToRadians(180.0), EPSILON);
    }



}