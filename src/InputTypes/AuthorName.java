package InputTypes;

public class AuthorName extends Input {
    public AuthorName() {
        userPrompt = "Enter the authors name displayed on your reference: ";
    };
  
    public void formatItem(String name) {
        if (name.toUpperCase().contains("associate".toUpperCase())) {
            name = removeSubstringFromString(name, "associate");
        }
        if (name.toUpperCase().contains("professor".toUpperCase())) {
            name = removeSubstringFromString(name, "professor");
        }
        if (name.toUpperCase().contains("hon ".toUpperCase())) {
            name = removeSubstringFromString(name, "hon");
        }
        if (name.toUpperCase().contains("dr ".toUpperCase()) || name.toUpperCase().contains("dr.".toUpperCase())) {
            name = removeSubstringFromString(name, "dr");
        }
        if (name.toUpperCase().contains("mr ".toUpperCase()) || name.toUpperCase().contains("mr.".toUpperCase())) {
            name = removeSubstringFromString(name, "mr");
        }
        if (name.toUpperCase().contains("ms ".toUpperCase()) || name.toUpperCase().contains("ms.".toUpperCase())) {
            name = removeSubstringFromString(name, "ms");
        }
        if (name.toUpperCase().contains("mrs".toUpperCase())) {
            name = removeSubstringFromString(name, "mrs");
        }
        if (name.toUpperCase().contains("miss ".toUpperCase())) {
            name = removeSubstringFromString(name, "miss");
        }
        if (name.toUpperCase().contains("master".toUpperCase())) {
            name = removeSubstringFromString(name, "master");
        }
        name = removeSubstringFromString(name, ".");
        name = removeSubstringFromString(name, ",");

        inputFormatted = name;
    }
}
