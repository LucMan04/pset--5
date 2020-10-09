package src;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keyboard.nextInt();

        if (num % 2 == 0){
            System.out.println("\nEven.");
        } else {
            System.out.println("\nOdd.");
        }
    }
}