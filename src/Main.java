public class Main {
    public static void main(String[] args) {

    String message = """
                        
                        
                        """;





      String decoded = cryptography.caesarDecoder(message, cryptography.freqAnalysis(message));

      System.out.println("Decoded: " + decoded);


    }
}