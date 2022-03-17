import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to your reference generator");
        System.out.println("Choose the number of your reference type from the options below");
        System.out.println("1. Choice 1");
        System.out.println("2. Choice 2");

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        // Reading data using readLine
        String name = reader.readLine();
        // Initiate the data
        GenerateReference generator = new GenerateReference();
        generator.makeChoice(name);
        System.out.println(generator.getReferenceChoice());

    }
}
