package gapinprimes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;


public class GapInPrimesTest {

    public static void main(String[] args) {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4,100,110)));
        assertEquals(null, GapInPrimes.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));
    }

}