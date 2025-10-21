import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        double side = input.nextDouble();
        double area = (side * side * Math.sqrt(3))/4;
        System.out.println("The area of the triangle is: " + area);
    }
}
