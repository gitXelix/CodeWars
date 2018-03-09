package highestandlowest;

import static org.junit.Assert.assertEquals;

public class Tests {

    public static void main(String[] args) {
        Tests test = new Tests();
        test.Test1();
    }

    private void Test1() {
        assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
