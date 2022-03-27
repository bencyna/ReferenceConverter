package InputTypes;

public class Title extends Input{
    public Title() {
        System.out.println("Title created");
        // for books, should be italics
        userPrompt = "Enter the title of your reference: ";
    };
    public void formatItem(String title) {
        inputFormatted = title;
    }

}
