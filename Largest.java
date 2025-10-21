import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a =");
        int a = sc.nextInt();
        System.out.print("Enter b =");
        int b = sc.nextInt();
        System.out.print("enter c =");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("a = " + a + " is Largest"); }
        else if (b>a && b>c) {
            System.out.println("b = " + b + " is Largest");
        } else if (c>a && c>b) {
            System.out.println("c = " + c + " is Largest");
        } else  {
            System.out.println("numbers are equal");
        }

//        or this is another way

        int max = a;
        if (b> max){
            max = b; }
        if (c> max){
            max = c;
        }
        System.out.println("max=" + max);
    }
}
