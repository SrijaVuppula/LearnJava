import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base of the Parallelogram:");
        double base = input.nextDouble();
        System.out.println("Please enter the height of the Parallelogram:");
        double height = input.nextDouble();
        double area = (base * height);
        System.out.println("The area of the Parallelogram is: " + area);
    }
}
