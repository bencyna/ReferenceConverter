package InputTypes;

import java.util.regex.Pattern;

public class Input {
    // parents of all input, name, year etc
    public String removeSubstringFromString(String parentString, String subString) {
        return parentString.replaceAll("(?i)"+ Pattern.quote(subString), "");
    }
    
    public String getInputType() { return "text"; }

    public void formatItem(String name) {}

    public String getFormattedResult() { return inputFormatted; }

    public void getUserPrompt() {
        System.out.println(userPrompt);
    }

    protected String userPrompt = "You have been prompted";
    protected String inputFormatted;
}
