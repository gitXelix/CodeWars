package romannumeralsencoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("solution(14) should equal to XIV", "XIV", conversion.solution(14));
        assertEquals("solution(984) should equal to CMLXXXIV", "CMLXXXIV", conversion.solution(984));
        assertEquals("solution(1889) should equal to MDCCCLXXXIX", "MDCCCLXXXIX", conversion.solution(1889));
    }
}
