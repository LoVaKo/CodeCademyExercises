import java.util.ArrayList;
// This program checks a DNA sequence for protein

public class DNA {

    public boolean hasProtein(String sequence) {
        boolean proteinFound = false;
        int startCodon = sequence.indexOf("ATG");
        int stopCodon = sequence.indexOf("TGA", startCodon + 3);

        if (startCodon != -1 && stopCodon != -1) {
            String subSequence = sequence.substring(startCodon, stopCodon);
            if (subSequence.length() % 3 == 0) {
                proteinFound = true;
            }
        }

        return proteinFound;
    }


    public static void main(String[] args) {
        DNA dnaCheck = new DNA();
        String dnaSequence1 = "ATGCGATACGCTTGA";
        String dnaSequence2 = "ATGCGATACGTGA";
        String dnaSequence3 = "ATTAATATGTACTGA";

        System.out.println(dnaCheck.hasProtein(dnaSequence1));
        System.out.println(dnaCheck.hasProtein(dnaSequence2));
        System.out.println(dnaCheck.hasProtein(dnaSequence3));


    }

}
