package mumbling;

/*
https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
 */

public class Accumul {

    public static String accum(String s) {

        int asciiChar;
        String output = "";

        for(int i = 0; i < s.length(); i++){
            asciiChar = s.charAt(i);
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    if(asciiChar >= 97 && asciiChar <= 122)
                        asciiChar -= 32; //make big letters
                }else{
                    if(asciiChar >= 65 && asciiChar <= 90)
                        asciiChar += 32;
                }
                output += (char)asciiChar;
            }

            if(i < s.length()-1)
                output += "-";

            //System.out.println(output);
        }
        return output;
    }
}
