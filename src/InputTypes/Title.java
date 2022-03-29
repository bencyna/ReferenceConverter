package InputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Title extends Input{
    public Title() {
        System.out.println("Title created");
        userPrompt = "Enter the title of your reference: ";
    };
    public Title(boolean book) {
        System.out.println("Title for book created (italicised) created");
        // for books, should be italics
        // i cant add code for punctuation, or capitalisation
        book = true;
        userPrompt = "Enter the title of your reference: ";
    };
    public void formatItem(String title) {

        if (book) {
            // set italics
            System.out.println(subtitle.length());

            if (subtitle.length() > 0) {
                title = title + ": " + subtitle;
            }
        }
        inputFormatted = title;
    }
    public String getUserPrompt() throws IOException {
        System.out.println(userPrompt);
        BufferedReader inputFieldInput = new BufferedReader(
        new InputStreamReader(System.in));

        String mainTitle = inputFieldInput.readLine();
        // Reading data using readLine
        System.out.println("Add the first subtitle, if no subtitle, leave blank");
        BufferedReader subTitle = new BufferedReader(
        new InputStreamReader(System.in));
        this.subtitle = subTitle.readLine();

        return mainTitle;
    }

    private boolean book = false;
    private String subtitle;
}
