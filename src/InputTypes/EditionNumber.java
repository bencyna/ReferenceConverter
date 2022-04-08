package InputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EditionNumber extends Input{
    public EditionNumber() { 
        System.out.println("EditionNumber created");
        userPrompt = "Enter the edition number (number only) (leave blank if no revised edition)";
        info = "A EditionNumber's name should only be included if it appears in the book, and shoul not be included if it is the same as the title. If there are multiple EditionNumbers, only include the first. Only english name should be used. geographical destinations need to be checked for importance";
    }
    public void formatItem(String EditionNumber) {
        String subScript = "th";
        String ending = " ed,";

        // check there is an edition number
        if (EditionNumber.length() > 1) {
            int number = Integer.parseInt(EditionNumber);
            if (number % 10 == 1) {
                subScript = "st";
            }
            if (number % 10 == 2) {
                subScript = "nd";
            }
            if (number % 10 == 3) {
                subScript = "rd";
            }
        }
        else {
            subScript = "";
        }

        if (revised.length() > 0) {
            ending = " rev ed,";
        }

        inputFormatted = EditionNumber + subScript + ending;
    }

    public String getUserPrompt() throws IOException {
        System.out.println("Is this a revised, expanded or updated edition? leave blank if no");
        BufferedReader revisedInput = new BufferedReader(
        new InputStreamReader(System.in));

        System.out.println(userPrompt);
        BufferedReader inputFieldInput = new BufferedReader(
        new InputStreamReader(System.in));

        String mainTitle = inputFieldInput.readLine();
        // Reading data using readline
        revised = revisedInput.readLine();
        return mainTitle;
    }
    private String revised;
}
