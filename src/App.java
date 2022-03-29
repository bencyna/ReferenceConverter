
import ReferenceTypes.Reference;
import InputTypes.Input;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to your reference generator");
  
        // Initiate the data
        GenerateReference generator = new GenerateReference();
        String name = generator.selectReferenceType();
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
            String userInputForField = inputs[i].getUserPrompt();
            // }
            
            inputs[i].formatItem(userInputForField);
            formattedResults.add(inputs[i].getFormattedResult());
        }
        String finalReference = reference.generateReference(formattedResults);
        System.out.println(finalReference);

    }
}
