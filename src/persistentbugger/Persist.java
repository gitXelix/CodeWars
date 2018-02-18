package persistentbugger;

/*
https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
 */

class Persist {
    public static int persistence(long n) {
        String sN = Long.toString(n);
        int counter = 0;
        int numbers;

        while(sN.length() > 1){
            numbers = 1;

            for(int i = 0; i < sN.length(); i++){
                numbers *= Character.getNumericValue(sN.charAt(i));
            }

            sN = Integer.toString(numbers);

            counter++;
        }

        return counter;

    }
}
