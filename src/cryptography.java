public class cryptography {

    public static String caesarShift( String MSG, int S){

        String CODED = "";
        char[] LETTERS = MSG.toCharArray();

        for (int i = 0; i < LETTERS.length; i++) {

            if (LETTERS[i] != ' '){
                int ASNUM = (int) LETTERS[i];
                ASNUM += S;
                CODED += (char) ASNUM;
            } else{
                CODED += LETTERS[i];
            }
        }

        return CODED;
    }




    public static String caesarShiftClassic( String MSG, int S){

        String CODED = "";
        char[] LETTERS = MSG.toLowerCase().toCharArray();

        for (int i = 0; i < LETTERS.length; i++) {

            if (LETTERS[i] != ' '){
                int ASNUM = (int) LETTERS[i];
                ASNUM += S;


                //Loop through the lowercase letters only.
                while(ASNUM > 122){
                    ASNUM-= 26;
                }
                while(ASNUM < 97){
                    ASNUM += 26;
                }
                //-----------------------------------------

                CODED += (char) ASNUM;
            } else{
                CODED += LETTERS[i];
            }
        }

        return CODED;
    }
}


