package introtojava2;
enum House {
    GAUR_CITY(50000),
    DDA(150000),
    GODREJ(200000),
    DLF_APPARTMENT(500000);

    private final int price;

    House(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name() + " Costs Rupees " + price;
    }
}
public class Question_1 {
    public static void main(String[] args) {
        System.out.println("House and their Prices:");

        for (House house : House.values()) {
            System.out.println(house);
        }
    }
}

