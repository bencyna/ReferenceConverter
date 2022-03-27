package ReferenceTypes;

import InputTypes.AuthorName;
import InputTypes.Input;
import InputTypes.Title;

import java.util.ArrayList;


public class BookReference extends Reference {
// should create the inputs it needs and return them 
public BookReference() {
    System.out.println("book reference created");
    
    authorName = new AuthorName();
    title = new Title();
};

public Input[] getInputs() {
    // create the inputs I require, e.g. author and add them to an array
    Input[] inputs = {authorName, title};    

    return inputs;
}
public String generateReference( ArrayList<String> formattedResults) {
    String reference = String.join(" ", formattedResults);
    return reference;
}




protected Input[] input_order;
// with those types, it should create the input fields for the user to inut the details, which should be the same for all types, changes must be stipulated in input object
private AuthorName authorName;
private Title title;


}
