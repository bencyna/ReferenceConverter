import java.io.BufferedReader;
import java.io.InputStreamReader;
import ReferenceTypes.Reference;
import InputTypes.Input;
import java.util.ArrayList;


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
        // store the data in parent class
        Reference reference = generator.createReference(generator.getReferenceChoice());
        Input[] inputs = reference.getInputs();

        ArrayList<String> formattedResults = new ArrayList<String>();

        for (int i =0; i < inputs.length; i++) {
            // from input type get the "type of input field I guess, maybe jist like a name like text, number, etc"
            // then that back to get getFormatted
            // then get formatted resylt and send to the reference type after for loop, with array of details
            
            //String inputType = inputs[i].getInputType();
            // if (inputType.equals("text")) {
                BufferedReader inputFieldInput = new BufferedReader(
                    new InputStreamReader(System.in));
                // Reading data using readLine
                String userInputForField = inputFieldInput.readLine();
            // }
            inputs[i].formatItem(userInputForField);
            formattedResults.add(inputs[i].getFormattedResult());
        }
    }
}
