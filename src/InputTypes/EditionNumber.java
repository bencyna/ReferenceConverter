package InputTypes;

public class EditionNumber extends Input{
    public EditionNumber() { 
        System.out.println("EditionNumber created");
        userPrompt = "Enter the edition number (number only)";
        info = "A EditionNumber's name should only be included if it appears in the book, and shoul not be included if it is the same as the title. If there are multiple EditionNumbers, only include the first. Only english name should be used. geographical destinations need to be checked for importance";
    }
    public void formatItem(String EditionNumber) {
        String subScript = "th";
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

        inputFormatted = EditionNumber + subScript + " " + "ed,";
    }
}
