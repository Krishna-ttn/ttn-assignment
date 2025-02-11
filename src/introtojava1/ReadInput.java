package introtojava1;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputByUser = new StringBuilder();

        System.out.println("Enter text (type XDONE to finish):");

        while (true) {
            String input = sc.nextLine();
            if (input.equals("XDONE")) {
                break;
            }
            inputByUser.append(input).append("\n");
        }

        System.out.println(inputByUser);
    }

}


