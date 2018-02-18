package sumofthefirstnthtermofseries;

/*
https://www.codewars.com/kata/555eded1ad94b00403000071
 */

public class NthSeries {

    public static String seriesSum(int n) {

        float ans = 1;
        int help = 1;

        for(int i = 1; i < n; i++){
            help += 3;
            ans += ((float)1/help);
        }

        return (n == 0) ? "0.00" : String.format("%.2f", ans);
    }
}