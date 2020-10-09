package src;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        int temperature = in.nextInt();
        String type = in.next();

        if (type.equals("F") || type.equals("f")) {
            if (temperature <= 32) {
                System.out.println(" ");
                System.out.println("Solid.");
            } else if (temperature < 212) {
                System.out.println(" ");
                System.out.println("Liquid.");
            } else {
                System.out.println(" ");
                System.out.println("Gas.");
            }
        } else if (type.equals("C") || type.equals("c")){
            if (temperature <= 0) {
                System.out.println(" ");
                System.out.println("Solid.");
            } else if (temperature < 100) {
                System.out.println(" ");
                System.out.println("Liquid.");
            } else {
                System.out.println(" ");
                System.out.println("Gas.");
            }
        } else {
            System.out.println(" ");
            System.out.println("That's not a valid scale.");
        }

        in.close();
    }
}