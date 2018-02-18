package vowelcount;

/*
https://www.codewars.com/kata/54ff3102c1bad923760001f3
 */

public class Vowels {

    public static int getCount(String str) {

        int vowelsCount = 0;

        final String[] check = {"a","e","i","o","u"};

        for (String aCheck : check) {
            vowelsCount += str.length() - str.replace(aCheck, "").length();
        }

        return vowelsCount;
    }

}
