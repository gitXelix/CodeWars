package findthenextperfectsquare;

/*
https://www.codewars.com/kata/56269eb78ad2e4ced1000013
 */

public class NumberFun {
    public static long findNextSquare(long sq) {
        double help = Math.sqrt(sq);
        if(Math.round(help) != Math.sqrt(sq)){
            return -1;
        }else{
            help = Math.pow(help+1, 2.0);
            return (long) help;
        }
    }
}
