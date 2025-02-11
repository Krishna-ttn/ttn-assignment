package introtojava1;

class SBI extends Bank {
    public SBI(String name, String headofficeAddress, String chairmanName, int branchCount,
               double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(name, headofficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "SBI Bank - " + super.toString();
    }
}
