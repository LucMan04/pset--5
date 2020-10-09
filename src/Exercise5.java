package src;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double letter = input.nextDouble();

        letter = Math.round(letter);

        if(letter > 100){
            System.out.println("\nGrades above 100 are invalid.");
        } else if(letter <= 100 && letter >= 90) {
            System.out.println("\nYou received an A.");
        } else if (letter < 90 && letter >= 80) {
            System.out.println("\nYou received a B.");
        } else if (letter < 80 && letter >= 70){
            System.out.println("\nYou received a C.");
        } else if (letter < 70 && letter >= 60){
            System.out.println("\nYou received a D.");
        } else if (letter < 60 && letter >= 0){
            System.out.println("\nYou received an F.");
        } else if (letter < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        }
    }
}