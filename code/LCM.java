import java.util.Scanner;

public class LCM {
    public static int findGCD(int a, int b) {  // Method to find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;   // remainder becomes new b
            a = temp;    // old b becomes new a
        }
        return a;  // when b becomes 0, a is the GCD
    }
    public static int findLCM(int a, int b) {  // Method to find LCM using formula: (a * b) / GCD
        return (a * b) / findGCD(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}