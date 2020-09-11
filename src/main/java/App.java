import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    private static String input;
    private static int key;
    public static String alphabet="abcdefghijklmnopqrstuvwxyz";
    public static  String  output="";

    public static void main(String[] args) {

        Console myConsole=System.console();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text to be encrypted:");


        try {
             input = bufferedReader.readLine().toLowerCase();
            System.out.println("What encryption key would you like to be used?");
            key = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Input String :" + input);

                for (int i = 0; i < input.length(); i++) {
                    int charPosition = alphabet.indexOf(input.charAt(i));
                    int newShiftKey = (charPosition + key) % 26;
                    char newChar = alphabet.charAt(newShiftKey);
                    output = output + newChar;
                    String EncryptedString = output;
                    System.out.println("Encrypted String :" + EncryptedString);
                }
                return;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
