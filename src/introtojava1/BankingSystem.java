package introtojava1;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating instances of the banks
        Bank sbiBank = new SBI("SBI", "Mumbai", "Krishna Sharma",
                24000, 7, 9.5, 8.5);
        Bank boiBank = new BOI("BOI", "Mumbai", "Kunal Rawat",
                5100, 6.5, 10.0, 8.0);
        Bank iciciBank = new ICICI("ICICI", "Mumbai", "Sanchit Arora",
                5000, 7.5, 11.0, 8.5);

        // Printing details of each bank
        System.out.println(sbiBank);
        System.out.println(boiBank);
        System.out.println(iciciBank);
    }
}



