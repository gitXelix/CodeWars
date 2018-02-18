package gimemeadiamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {

    public static void main(String[] args) {
        DiamondTest test = new DiamondTest();
        test.testDiamond3();
        test.testDiamond5();
    }


    private void testDiamond3() {
        StringBuilder expected = new StringBuilder();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }


    private void testDiamond5() {
        StringBuilder expected = new StringBuilder();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }
}
