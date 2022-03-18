package ReferenceTypes;

import InputTypes.AuthorName;
import InputTypes.Input;

public class BookReference extends Reference {
// should create the inputs it needs and return them 
public Input[] getInputs() {
    // create the inputs I require, e.g. author and add them to an array
    AuthorName author = new AuthorName();
    Input[] inputs = {author};    
    
    return inputs;
}
protected Input[] input_order;
// with those types, it should create the input fields for the user to inut the details, which should be the same for all types, changes must be stipulated in input object



}
