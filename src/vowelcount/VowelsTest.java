package vowelcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {
    public static void main(String[] args) {
        VowelsTest test = new VowelsTest();
        test.testCase1();
    }

    private void testCase1() {
        assertEquals(5, Vowels.getCount("abracadabra"));
    }

}