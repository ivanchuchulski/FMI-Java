import fmi.math.MyMath;
import org.junit.jupiter.api.*;

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

    @Test
    void sumTestOne() {
        assertEquals(15.9 , MyMath.sum(5.3, 10.6), EPSILON);
    }

    @Test
    void product() {
    }

    @Test
    void integerPow() {
    }

    @Test
    void radiansToDegrees() {
    }

    @Test
    void degreesToRadians() {
    }
}