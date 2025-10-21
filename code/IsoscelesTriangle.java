//Area Of Isosceles Triangle
import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 'a' side (equal side) of the triangle:");
        double a = input.nextDouble();
        System.out.print("Please enter 'b' side of the triangle:");
        double b = input.nextDouble();
        double area = (b / 4) * Math.sqrt((4 * a * a) - (b * b));
        System.out.println("The area of the triangle is " + area);
    }
}
