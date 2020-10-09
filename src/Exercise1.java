package src;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        double integer = keyboard.nextDouble();

        if (integer > 0){
            System.out.println();
            System.out.println("Positive.");
        } else if (integer < 0){
            System.out.println();
            System.out.println("Negative.");
        } else{
            System.out.println();
            System.out.println("Zero.");
        }
    }
}