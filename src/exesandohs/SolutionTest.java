package exesandohs;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.testSomething1();
        test.testSomething2();
        test.testSomething3();
        test.testSomething4();
        test.testSomething5();
        test.testSomething6();
        test.testSomething7();
    }

    private void testSomething1() {
        assertEquals(true, XO.getXO("xxxooo"));
    }

    private void testSomething2() {
        assertEquals(true, XO.getXO("xxxXooOo"));
    }

    private void testSomething3() {
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    private void testSomething4() {
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    private void testSomething5() {
        assertEquals(false, XO.getXO("XxxxooO"));
    }

    private void testSomething6() {
        assertEquals(true, XO.getXO("zssddd"));
    }

    private void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}
