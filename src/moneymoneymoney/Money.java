package moneymoneymoney;

/*
https://www.codewars.com/kata/563f037412e5ada593000114
 */

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        // your code
        int counter = 0;
        while(principal < desired){
            principal += principal * interest * (1 - tax);
            counter++;
        }

        return counter;
    }
}
