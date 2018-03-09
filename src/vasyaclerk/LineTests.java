package vasyaclerk;

import static org.junit.Assert.assertEquals;

public class LineTests {

    public static void main(String[] args) {
        LineTests test = new LineTests();
        test.test1();
        test.test2();
    }

    private void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }

    private void test2() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
}
