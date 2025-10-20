// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number, A = ");
        int a = sc.nextInt();
        System.out.print("Enter Number, B = ");
        int b = sc.nextInt();
        if  (a == b) {
            System.out.println("Numbers A and B are equal ");
        } else if (a > b){
            System.out.println("Number A greater than B ");
        } else  {
            System.out.println("Number B greater than A ");
        }
        int greatest = Math.max(a, b);
        System.out.println("The greatest number is: " + greatest);
        int smallest = Math.min(a, b);
        System.out.println("The smallest number is: " + smallest);
    }
}
