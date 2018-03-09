package sumofthefirstnthtermofseries;

import static org.junit.Assert.assertEquals;

public class NthSeriesTest {
    public static void main(String[] args) {
        NthSeriesTest test = new NthSeriesTest();
        test.test1();
        test.test2();
        test.test3();
    }

    private void test1() {
        assertEquals(NthSeries.seriesSum(5), "1.57");
    }

    private void test2() {
        assertEquals(NthSeries.seriesSum(9), "1.77");
    }

    private void test3() {
        assertEquals(NthSeries.seriesSum(15), "1.94");
    }
}
