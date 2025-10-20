import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        boolean ans = isPrime(n) ;
        System.out.println("Entered number is Prime =" + ans);

    }
    static boolean isPrime(int n){
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        if (i*i>n){
            return true;
        }
        return false;
    }
}
