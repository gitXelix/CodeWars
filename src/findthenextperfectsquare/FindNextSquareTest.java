package findthenextperfectsquare;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNextSquareTest {

    public static void main(String[] args) {
        FindNextSquareTest test = new FindNextSquareTest();
        test.test1();
        test.test2();
        test.test3();
    }

    private void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    private void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    private void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }


}
