package findthemissingletter;

/*
https://www.codewars.com/kata/5839edaa6754d6fec10000a2
 */

public class Kata
{
    public static char findMissingLetter(char[] array)
    {

        int counter = 0;
        for(char alphabet = array[counter]; alphabet <= array[array.length-1]; alphabet++){
            if(alphabet != array[counter])
                return alphabet;

            counter++;
        }
        return ' ';
    }
}
