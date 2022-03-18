package InputTypes;

import java.util.regex.Pattern;

public class Input {
    // parents of all input, name, year etc
    public String removeSubstringFromString(String parentString, String subString) {
        return parentString.replaceAll("(?i)"+ Pattern.quote(subString), "");
    }
}
