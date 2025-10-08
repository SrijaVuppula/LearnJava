//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal, P : ");
        int P = input.nextInt();
        System.out.print("Enter the Time, T : ");
        int T = input.nextInt();
        System.out.print("Enter the Rate, R : ");
        Float R = input.nextFloat();
        int sum = (int) (P * T * R);
        input.close();
        System.out.println("Simple Interest is: " + sum);
    }
}
