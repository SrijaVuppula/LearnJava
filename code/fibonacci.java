//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
//    F(n) = F(n-1) + F(n-2)
       Scanner sc = new Scanner(System.in);
        System.out.print("enter number of terms : ");
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        System.out.println("Fibonacci Series upto " + n + " terms");
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
            int k = i + j;
            i = j;
            j = k;
        }
    }
}
