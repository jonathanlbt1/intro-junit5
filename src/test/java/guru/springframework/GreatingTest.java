package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatingTest {

    /**
     * Method under test: {@link Greeting#helloWorld()}
     */

    Greeting greeting;
    @BeforeAll
    static void beforeAll() {
        System.out.println("In BeforeAll...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach...");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        assertEquals("Hello World", (greeting).helloWorld());
        assertEquals("Hello Name", (greeting).helloWorld("Name"));
    }

    @Test
    void testHelloWorld2() {
        assertEquals("Hello World", (greeting).helloWorld());
        assertEquals("Hello Name", (greeting).helloWorld("Name"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("In AfterAll...");
    }
}

