package romannumeralsencoder;

public class Conversion {

    public String solution(int n) {
        char[] romanNumbers = new char[]{'I','V','X','L','C','D','M'};
        StringBuilder result = new StringBuilder();
        int partOfNumber;

        for (int i = 10000; i > 0; i /= 10) {
            int divideNumber = n / i;

            if(i == 1)
                divideNumber = n % 10;

            while(divideNumber >= 10)
                divideNumber %= 10;

            switch (i){
                case 1000:
                    partOfNumber = 6;
                    break;
                case 100:
                    partOfNumber = 4;
                    break;
                case 10:
                    partOfNumber = 2;
                    break;
                case 1:
                    partOfNumber = 0;
                    break;
                default:
                    partOfNumber = 0;
                    break;
            }

            switch (divideNumber){
                case 1:
                    result.append(romanNumbers[partOfNumber]);
                    break;
                case 2:
                    result.append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]);
                    break;
                case 3:
                    result.append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]);
                    break;
                case 4:
                    result.append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber+1]);
                    break;
                case 5:
                    result.append(romanNumbers[partOfNumber+1]);
                    break;
                case 6:
                    result.append(romanNumbers[partOfNumber+1]).append(romanNumbers[partOfNumber]);
                    break;
                case 7:
                    result.append(romanNumbers[partOfNumber+1]).append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]);
                    break;
                case 8:
                    result.append(romanNumbers[partOfNumber+1]).append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber]);
                    break;
                case 9:
                    result.append(romanNumbers[partOfNumber]).append(romanNumbers[partOfNumber+2]);
                    break;


            }
//            System.out.println(result.toString() + " " + partOfNumber + " " + divideNumber + " " + i  + " " + romanNumbers[partOfNumber]);

        }



        return result.toString();
    }
}

