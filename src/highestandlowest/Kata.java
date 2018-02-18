package highestandlowest;

/*
https://www.codewars.com/kata/554b4ac871d6813a03000035
 */

import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {
        // Code here or
        String[] sArray = numbers.split(" ");
        int[] iArray = new int[sArray.length];

        for(int i = 0; i < sArray.length; i++){
            iArray[i] = Integer.parseInt(sArray[i]);
        }

        int max = Arrays.stream(iArray).max().getAsInt();
        int min = Arrays.stream(iArray).min().getAsInt();

        return max + " " + min;
    }
}
