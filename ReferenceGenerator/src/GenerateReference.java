import ReferenceTypes.Reference;

public class GenerateReference {
    public void makeChoice(String choice) {
        referenceType = choice;
     }
     public String getReferenceChoice() { return referenceType; }
     public Reference createReference(String referenceType) { 
        if (referenceType == "1") {
            System.out.println("Retrun the first reference");
            // make these child classes // starting with Cases and then Legistlation
            Reference reference1 = new Reference();
            return reference1;
        }
        else {
            System.out.println("Retrun the default reference");
            Reference reference1 = new Reference();
            return reference1;
        }
     }
    private String referenceType;
}
