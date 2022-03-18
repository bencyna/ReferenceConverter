package ReferenceTypes;

import InputTypes.AuthorName;
import InputTypes.Input;

public class BookReference extends Reference {
// should create the inputs it needs and return them 
public BookReference() {
    authorName = new AuthorName();
    
};

public Input[] getInputs() {
    // create the inputs I require, e.g. author and add them to an array
    Input[] inputs = {authorName};    

    return inputs;
}
protected Input[] input_order;
// with those types, it should create the input fields for the user to inut the details, which should be the same for all types, changes must be stipulated in input object
private AuthorName authorName;


}
