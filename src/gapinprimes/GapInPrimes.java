package gapinprimes;

/*
https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4
 */

class GapInPrimes {

    public static boolean isItPrime(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0)
                return false;
        }

        return true;
    }

    public static long[] gap(int g, long m, long n) {
        if(g < 2 || m <= 2 || m > n)
            return null;


        long [] result = new long[2];

        for(int i = (int)m; i < n; i++){
            if(isItPrime(i))
                result[1] = i;

            if((result[1] - result[0]) == g)
                return result;


            result[0] = result[1];

        }


        return null;
    }
}