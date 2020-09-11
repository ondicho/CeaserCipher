import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Console myConsole=System.console();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text to be encrypted:");


        try {
            String userInput = bufferedReader.readLine();
            System.out.println("What encryption key would you like to be used?");
            int encryptionKey = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
