package ReferenceTypes;

import InputTypes.Input;

public class Reference {
    public String[] neededDetails() { 
        String[] neededDetails = {authorFirstName, authorLastName, year};
        return neededDetails;
    }
    public Input[] getInputs() {
    Input[] inputs = {}; 

    return inputs;
    }
    
    protected String authorFirstName;
    protected String authorLastName;
    protected String year;
}

