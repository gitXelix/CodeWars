package takeatenminutewalk;

/*
https://www.codewars.com/kata/54da539698b8a2ad76000228
 */

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        if(walk.length % 2 != 0 || walk.length != 10)
            return false;

        int ns = 0;
        int we = 0;

        for (char aWalk : walk) {
            if (aWalk == 'n') {
                ns++;
            } else if (aWalk == 's') {
                ns--;
            } else if (aWalk == 'e') {
                we++;
            } else {
                we--;
            }
        }

        return ns == 0 && we == 0;
    }
}
