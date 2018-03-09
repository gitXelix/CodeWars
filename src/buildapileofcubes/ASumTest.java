package buildapileofcubes;

import static org.junit.Assert.assertEquals;

public class ASumTest {
    public static void main(String[] args) {
        ASumTest test = new ASumTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    private void test1() {
        assertEquals(2022, ASum.findNb(4183059834009L));
    }

    private void test2() {
        assertEquals(-1, ASum.findNb(24723578342962L));
    }

    private void test3() {
        assertEquals(4824, ASum.findNb(135440716410000L));
    }

    private void test4() {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }

}

