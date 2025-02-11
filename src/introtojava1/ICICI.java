package introtojava1;

public class ICICI extends Bank {
    public ICICI(String name, String headofficeAddress, String chairmanName, int branchCount,
                 double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headofficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "ICICI Bank - " + super.toString();
    }
}
