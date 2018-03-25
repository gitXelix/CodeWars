package fibonaccitribonacciandfriends;

import java.util.Arrays;

public class Xbonacci {
    public double[] xbonacci(double[] signature, int n) {
        int X = signature.length,
                startCounting = 0;

        double result[] = Arrays.copyOf(signature, n);

        for (int i = X; i < n; i++, startCounting++) {
            for (int j = 0; j < X; j++) {
                result[i] += result[j+startCounting];
            }
        }

        return result;
    }
}
