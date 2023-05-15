public class cryptography {

    public static String caesarShift(String MSG, int S) {

        String CODED = "";
        char[] LETTERS = MSG.toCharArray();

        for (int i = 0; i < LETTERS.length; i++) {

            if (LETTERS[i] != ' ') {
                int ASNUM = (int) LETTERS[i];
                ASNUM += S;
                CODED += (char) ASNUM;
            } else {
                CODED += LETTERS[i];
            }
        }

        return CODED;
    }


    public static String caesarShiftClassic(String MSG, int S) {

        String CODED = "";
        char[] LETTERS = MSG.toLowerCase().toCharArray();

        for (int i = 0; i < LETTERS.length; i++) {

            if (LETTERS[i] != ' ') {
                int ASNUM = (int) LETTERS[i];
                ASNUM += S;


                //Loop through the lowercase letters only.
                while (ASNUM > 122) {
                    ASNUM -= 26;
                }
                while (ASNUM < 97) {
                    ASNUM += 26;
                }
                //-----------------------------------------

                CODED += (char) ASNUM;
            } else {
                CODED += LETTERS[i];
            }
        }

        return CODED;
    }


    public static String caesarDecoder(String CODE, int S) {
        return caesarShift(CODE, -S);
    }

    public static String classicDecoder(String CODE, int S) {
        return caesarShiftClassic(CODE, -S);
    }


    public static int freqAnalysis(String msg){

        int[] counts = new int[100000];

        char[] array = msg.toCharArray();

        for (int i = 0; i < array.length; i++) {

            int ASNUM = (int) array[i];
            if(ASNUM > 33) {
                counts[ASNUM] += 1;
            }
        }

        int highIndex = -1;
        int highValue = 0;
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > highValue){
                highIndex = i;
                highValue = counts[i];
            }
        }

        return highIndex-101;

    }

}
