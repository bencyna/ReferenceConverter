package ReferenceTypes;
public class Reference {
    public String[] neededDetails() { 
        String[] neededDetails = {authorFirstName, authorLastName, year};
        return neededDetails;
    }
    
    protected String authorFirstName;
    protected String authorLastName;
    protected String year;
}

