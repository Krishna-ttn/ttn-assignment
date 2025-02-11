package introtojava1;

public class BOI extends Bank {
    public BOI(String name, String headofficeAddress, String chairmanName, int branchCount,
    double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headofficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "BOI Bank - " + super.toString();
    }
}
