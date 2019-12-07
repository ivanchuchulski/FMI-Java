package exercise1.Zad4;

// class to encode a four-digit number to a sequence of nucleotide bases
public class NucleotideBases {
    private int nucleotideCode;
    private char nucleotideBases[] = {'A', 'C', 'G', 'T'};
    private String nucleotideSequence;

    // constructors
   public NucleotideBases() {
        this.nucleotideCode = 1234;
        nucleotideSequence = buildNucleotideSequence(this.nucleotideCode);
    }

    public NucleotideBases(int fourDigitNumber) {
        setNucleotideCode(fourDigitNumber);
        nucleotideSequence = buildNucleotideSequence(this.nucleotideCode);
    }

    // setters
    public void setNucleotideCode(int nucleotideCode) {
        if (nucleotideCode < 999 || nucleotideCode > 10_000) {
            this.nucleotideCode = 1234;
        }
        else {
            this.nucleotideCode = nucleotideCode;
        }

        nucleotideSequence = buildNucleotideSequence(this.nucleotideCode);
    }

    // getters
    public String getNucleotideSequence() {
        return new String(nucleotideSequence);
    }

    // helper methods
    private String buildNucleotideSequence(int nucleotideCode)
    {
        String numberAsString = String.valueOf(nucleotideCode);
        String numberToBaseFour = Integer.toString(Integer.parseInt(numberAsString, 10), 4);
        StringBuilder builder = new StringBuilder();

        // for testing
//        String unconverted = Integer.toString(Integer.parseInt(numberToBaseFour, 4), 10);
//        System.out.printf("base4 : %s%n", numberToBaseFour);
//        System.out.printf("original :  %s%n", unconverted);

        // we need to obtain the numeric value of the character in the string, in order to use it as array index
        for (int i = 0; i <  numberToBaseFour.length(); i++) {
            int nucleotideIndex = Character.getNumericValue(numberToBaseFour.charAt(i));
//            int nucleotideIndex2 = numberToBaseFour.charAt(i) - '0';    // other way to do it

            builder.append(nucleotideBases[nucleotideIndex]);
        }

        return builder.toString();
    }
}
