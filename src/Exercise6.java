package src;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        String input = scan.nextLine().toLowerCase();
        String suit;
        String rank;
        switch (input.substring(0, 1)) {
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "t":
                rank = "Ten";
                break;
            case "j":
                rank = "Jack";
                break;
            case "q":
                rank = "Queen";
                break;
            case "k":
                rank = "King";
                break;
            case "a":
                rank = "Ace";
                break;
            default:
                System.out.printf("%nThat's not a valid rank.%n");
                return;
        }
        switch (input.substring(input.length() - 1)) {
            case "c":
                suit = "Clubs";
                break;
            case "d":
                suit = "Diamonds";
                break;
            case "h":
                suit = "Hearts";
                break;
            case "s":
                suit = "Spades";
                break;
            default:
                System.out.printf("%nThat's not a valid suit.%n");
                return;
        }
        System.out.printf("%n" + rank + " of " + suit + ".%n");
        scan.close();
    }
}