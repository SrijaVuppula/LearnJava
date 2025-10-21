import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char a = sc.next().trim().charAt(0);
        if (a >= 'A' && a <= 'Z') {
            System.out.println(a + " " + "is Uppercase ");
        }  else if (a >= 'a' && a <= 'z') {
            System.out.println(a + " " + "is Lowercase ");
        }
    }
}
