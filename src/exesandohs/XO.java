package exesandohs;

/*
https://www.codewars.com/kata/55908aad6620c066bc00002a
 */

public class XO {

    public static boolean getXO (String str) {

        // Good Luck!!
        String testString = str.toLowerCase();
        long x = testString.codePoints().filter(ch -> ch == 'x').count();
        long o = testString.codePoints().filter(ch -> ch == 'o').count();

        return x == o;

    }
}

