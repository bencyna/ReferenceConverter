import ReferenceTypes.BookReference;
import ReferenceTypes.Reference;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateReference {
    public String selectReferenceType() throws IOException { 
        System.out.println("Choose the number of your reference type from the options below");
        System.out.println("1. Reference to a book");
        System.out.println("2. Choice 2");

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        // Reading data using readLine
        return reader.readLine();

    }
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
