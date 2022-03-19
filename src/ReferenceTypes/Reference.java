package ReferenceTypes;

import InputTypes.Input;
import java.util.ArrayList;


public class Reference {
    public String[] neededDetails() { 
        String[] neededDetails = {authorFirstName, authorLastName, year};
        return neededDetails;
    }
    public Input[] getInputs() {
    Input[] inputs = {}; 

    return inputs;
    }

    public String generateReference( ArrayList<String> formattedResults) {return "default reference generated";}

    
    protected String authorFirstName;
    protected String authorLastName;
    protected String year;
}

