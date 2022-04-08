package InputTypes;

public class Publisher extends Input{
    public Publisher() { 
        System.out.println("Publisher created");
        userPrompt = "Enter the name of your references publisher as it appears on the title page, or if no publisher is available there, use the publication information page instead: ";
        info = "A publisher's name should only be included if it appears in the book, and shoul not be included if it is the same as the title. If there are multiple publishers, only include the first. Only english name should be used. geographical destinations need to be checked for importance";
    }
    public void formatItem(String publisher) {
        // check for corporate status, and countries
        // in future have message: this reference contains country, is it crucial?
        if (publisher.toUpperCase().contains("Pty ".toUpperCase()) || publisher.toUpperCase().contains("Pty.".toUpperCase())) {
            publisher = removeSubstringFromString(publisher, "Pty");
        }
        if (publisher.toUpperCase().contains("Ltd ".toUpperCase()) || publisher.toUpperCase().contains("Ltd.".toUpperCase())) {
            publisher = removeSubstringFromString(publisher, "Ltd");
        }
        if (publisher.toUpperCase().contains("Co ".toUpperCase()) || publisher.toUpperCase().contains("Co.".toUpperCase())) {
            publisher = removeSubstringFromString(publisher, "Co");
        }
        // etc
        inputFormatted = publisher;
    }
}
