package vasyaclerk;

/*
https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
 */

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int dol25 = 0;
        int dol50 = 0;
        int dol100 = 0;

        for(int x : peopleInLine){
            if(x == 25){
                dol25++;
            }else if(x == 50){
                if(dol25 > 0){
                    dol25--;
                    dol50++;
                }else{
                    return "NO";
                }

            }else{
                if(dol50 == 0 && dol25 >= 3){
                    dol100++;
                    dol25 -= 3;
                }else if(dol25 >= 1 && dol50 >= 1){
                    dol100++;
                    dol25--;
                    dol50--;
                }else{
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
