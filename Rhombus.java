import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter diagonal d1 of the Rhombus:");
        double d1 = input.nextDouble();
        System.out.println("Please enter diagonal d2 of the Rhombus:");
        double d2 = input.nextDouble();
        double area = (d1 * d2)/2;
        System.out.println("The area of the Rhombus is: " + area);
    }

}