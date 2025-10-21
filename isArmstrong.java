import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number =");
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);

        for (int i = 1; i < 10000; i++) {  //prints all the armstrong numbers from 1 to 10000
            if(isArmstrong(i)){
                System.out.println(i);
            }
            
        }
    }
    static boolean isArmstrong(int n){  // prints given number is armstrong or not.
        int original = n;
        int sum = 0;
       while(n>0){
           int rem = n%10;
           n = n/10;
           int cube = rem*rem*rem;
           sum = sum + cube;
       }
       if(sum==original){
           return true;
       }
        return false;
    }
}
