import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        areaOfCircle();
    }

    public static void areaOfCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle (in cm): ");
        double radius = input.nextDouble();

        double areaOfCircle = getArea(radius);

        System.out.printf("Radius: %.2f cm\n", radius);
        System.out.printf("Area of circle: ~%.2f cm\n", areaOfCircle);
    }

    public static double getArea(double radius) {
        double pi = 3.14159265;
        return pi * Math.pow(radius, 2);
    }
}
