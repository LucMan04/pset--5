package src;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = in.next();

        String days = null;

        switch (month) {
            case "January":
            case "january":
            case "Jan":
            case "jan":
            case "Janu":
            case "janu":
            case "March":
            case "march":
            case "Mar":
            case "mar":
            case "Marc":
            case "marc":
            case "May":
            case "may":
            case "July":
            case "july":
            case "Jul":
            case "jul":
            case "August":
            case "august":
            case "Aug":
            case "aug":
            case "Augu":
            case "augu":
            case "October":
            case "october":
            case "Oct":
            case "oct":
            case "Octo":
            case "octo":
            case "December":
            case "december":
            case "Dec":
            case "dec":
            case "Dece":
            case "dece":
                days = "31 days.";
                break;
            case "April":
            case "april":
            case "Apr":
            case "apr":
            case "Apri":
            case "apri":
            case "June":
            case "june":
            case "Jun":
            case "jun":
            case "September":
            case "september":
            case "Sep":
            case "sep":
            case "Sept":
            case "sept":
            case "November":
            case "november":
            case "Nov":
            case "nov":
            case "Nove":
            case "nove":
                days = "30 days.";
                break;
            case "February":
            case "february":
            case "Feb":
            case "feb":
            case "Febr":
            case "febr":
                days = "28 or 29 days.";
                break;
            default:
                days = "That's not a valid month.";
                break;
        }

        System.out.println(" ");
        System.out.println(days);

        in.close();
    }
}