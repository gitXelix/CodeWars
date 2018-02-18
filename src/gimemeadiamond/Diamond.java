package gimemeadiamond;

class Diamond {
    public static String print(int n) {
        if(n % 2 == 0 || n <= 0)
            return null;

        int help = n, jumps = 0;
        String output = "";
        StringBuilder expected = new StringBuilder();

        while(help != 1){
            help -= 2;
            jumps++;
        }

        help = jumps;//nr of spaces
        int help2 = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < help; j++){ //add spaces to string
                output = output.concat(" ");
            }

            if(help > 0 && i < Math.round(n/2))
                help--;
            else
                help++;

            for(int j = 0; j < help2; j++){
                output = output.concat("*");
            }

            if(help2 < n && i < Math.round(n/2))
                help2 += 2;
            else
                help2 -= 2;

            output = output.concat("\n");

            expected.append(output);
            output = "";
        }

        return expected.toString();

    }
}
