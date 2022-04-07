package InputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Input {
    // parents of all input, name, year etc
    public String removeSubstringFromString(String parentString, String subString) {
        return parentString.replaceAll("(?i)"+ Pattern.quote(subString), "");
    }

    public String getInputType() { return "text"; }

    public void formatItem(String name) {}

    public String getFormattedResult() { return inputFormatted; }

    public String getUserPrompt() throws IOException {
        System.out.println(userPrompt);
        BufferedReader inputFieldInput = new BufferedReader(
        new InputStreamReader(System.in));
        // Reading data using readLine
         return inputFieldInput.readLine();
    }

    protected String userPrompt = "You have been prompted";
    protected String inputFormatted;
    protected String info;
}
