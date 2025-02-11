package introtojava1;

public class Bank {
    private String name;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    // Constructor
    public Bank(String name, String headofficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headofficeAddress = headofficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadofficeAddress() { return headofficeAddress; }
    public void setHeadofficeAddress(String headofficeAddress) { this.headofficeAddress = headofficeAddress; }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) { this.homeLoanInterestRate = homeLoanInterestRate; }

    // toString method to print the bank details
    @Override
    public String toString() {
        return "Bank [name=" + name + ", headofficeAddress=" + headofficeAddress + ", chairmanName=" + chairmanName
                + ", \nbranchCount=" + branchCount + ", fdInterestRate=" + fdInterestRate
                + ", personalLoanInterestRate=" + personalLoanInterestRate + ", homeLoanInterestRate="
                + homeLoanInterestRate + "]" + "\n";
    }
}





