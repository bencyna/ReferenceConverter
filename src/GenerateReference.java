import ReferenceTypes.BookReference;
import ReferenceTypes.Reference;


public class GenerateReference {
    public void makeChoice(String choice) {
        referenceType = choice;
     }
     public String getReferenceChoice() { return referenceType; }
     public Reference createReference(String referenceType) { 

        if (referenceType.equals("1")) {
            // make these child classes // starting with Cases and then Legistlation
            BookReference book_reference = new BookReference();
            return book_reference;
        }
        else {
            Reference reference1 = new Reference();
            return reference1;
        }
     }

    private String referenceType;
}
