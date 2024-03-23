// Custom exception class
class NOMATCHEXCP extends Exception {
    private String inputString;
    private int lineNumber;

    // Constructor to initialize the exception with the erroneous string and line number
    public NOMATCHEXCP(String message, String inputString, int lineNumber) {
        super(message);
        this.inputString = inputString;
        this.lineNumber = lineNumber;
    }

    // Overridden toString() method to display exception message along with the erroneous string and line number
    @Override
    public String toString() {
        return "NOMATCHEXCP at line " + lineNumber + ": " + getMessage() + " - Erroneous string: " + inputString;
    }
}