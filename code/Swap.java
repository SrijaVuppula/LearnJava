import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
//        calling the function swap
        swap();
        new Swap1();
    }

    static void swap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = input.nextInt();
        System.out.print("Enter B = ");
        int b = input.nextInt();
        System.out.println("Entered A, B = (" + a + ", " + b + ")");
        int c = a;
        a = b;
        b = c;

        System.out.println("Swap of A,B = (" + a + "," + b + ")");
    }

    // another way to swap numbers
    static class Swap1 {
        Swap1() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter D = ");
            int d = input.nextInt();
            System.out.print("Enter E = ");
            int e = input.nextInt();
            System.out.println("Entered D, E = (" + d + ", " + e + ")");

            int f = d;
            d = e;
            e = f;
            System.out.println("Swap of D, E = (" + d + ", " + e + ")");

        }
    }
}