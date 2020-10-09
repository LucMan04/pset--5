package src;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();
        in.nextLine();

        System.out.print("Enter hours worked: ");
        double hours = in.nextDouble();

        if (wage < 0) {
            System.out.println(" ");
            System.out.println("Your wage must be greater than or equal to $0.00/hour.");
        } else if (hours < 0) {
            System.out.println(" ");
            System.out.println("Your hours must be greater than or equal to 0.0.");
        } else {
            if (hours > 40) {
                double overTime = hours - 40;
                hours -= overTime;

                double firstMoney = wage * hours;

                double overTimeWage = wage * 1.5;
                double secondMoney = overTimeWage * overTime;

                double finalMoney = firstMoney + secondMoney;

                System.out.println(" ");
                System.out.printf("You'll make $%,.2f", finalMoney); System.out.print(" this week.");

            }
        }



        in.close();
    }
}