package com.fizzBuzz.FizzBuzz;
import org.junit.jupiter.api.*;

class MyMojoTest {

    public MyMojo fB;

    @BeforeEach
    public void setUp() {
        fB = new MyMojo();
    }

    @DisplayName("Play MyMojo with number = 1")
    @Test
    public void testNumber() {
        String MyMojo = fB.mapIntToFizzBuzz(1);
        Assertions.assertEquals(MyMojo, "1");
    }

    @DisplayName("Play MyMojo with number = 3")
    @Test
    public void testFizz() {
        String MyMojo = fB.mapIntToFizzBuzz(3);
        Assertions.assertEquals(MyMojo, "Fizz");
    }
    
    @DisplayName("Play MyMojo with number series")
    @Test
    public void testFizzSeries() {
        MyMojo.doStreamFizzBuzz(100);
    }

    @DisplayName("Play MyMojo with number = 5")
    @Test
    public void testBuzz() {
        String MyMojo = fB.mapIntToFizzBuzz(5);
        Assertions.assertEquals(MyMojo, "Buzz");
    }

	/*
	 * @DisplayName("Don't Play MyMojo with number = 0")
	 * 
	 * @Test public void testZero() {
	 * 
	 * Assertions.assertThrows(IllegalArgumentException.class, () ->
	 * fB.mapIntToFizzBuzz(0)); }
	 */
    @AfterEach
    public void tearDown() {
        fB = null;
    }

}