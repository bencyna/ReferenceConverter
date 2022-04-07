package InputTypes;

public class Publisher extends Input{
    public Publisher() { 
        System.out.println("Publisher created");
        userPrompt = "Enter the name of your references publisher as it appears on the title page, or if no publisher is available there, use the publication information page instead: ";
        info = "A publisher's name should only be included if it appears in the book, and shoul not be included if it is the same as the title. If there are multiple publishers, only include the first. Only english name should be used";
    }
    public void formatItem(String publisher) {
        // check for corporate status, and countries
        // in future have this reference contains country, is it crucial?

        inputFormatted = publisher;
    }
}
