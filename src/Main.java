import simple_bank.BankAccount;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        areaOfCircle();
//        leapYear();
//        averageSum();
//        reverseString();

        // ATM Machine
        BankAccount dan = new BankAccount("Daniel Villanueva");
        dan.depositAmount(1);
        dan.testDivision();
        System.out.println(dan.getBalance());
    }

    public static void areaOfCircle() {
        System.out.println("--Problem 1--");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle (in cm): ");

        double radius = input.nextDouble();

        double areaOfCircle = getArea(radius);

        System.out.printf("Radius: %.2f cm\n", radius);
        System.out.printf("Area of circle: ~%.2f cm\n", areaOfCircle);
    }

    public static double getArea(double radius) {
        return 3.14159265 * Math.pow(radius, 2);
    }

    public static void leapYear() {
        System.out.println("\n--Problem 2--");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) System.out.printf("%d is leap year!\n", year);
        else System.out.printf("%d is not a leap year!\n", year);
    }

    public static void averageSum() {
        System.out.println("\n--Problem 3--");
        Scanner input = new Scanner(System.in);
        double[] arr = {0, 0, 0, 0, 0};  //arrays lengths have to be specified
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextDouble();
            sum += arr[i];
        }

        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is " + (sum / arr.length));
    }

    public static void reverseString() {
        System.out.println("\n--Problem 4--");
        Scanner input = new Scanner(System.in);
        String reverseWord = " ";

        System.out.print("Enter a phrase or sentence to reverse: ");
        String word = input.nextLine();


        for (int i = 0; i < word.length(); i++) {
            reverseWord = word.charAt(i) + reverseWord; //insert char before first char
        }

        System.out.println("Input is: " + word + ".\nReversed string: " + reverseWord);
    }
}
