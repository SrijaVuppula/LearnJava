import java.util.Scanner;

public  class Methodsss {
    public static void main(String[] args) {
        sum();
        greeting();
        sum();
        sum2(2,2);
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }
    static void greeting(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
//    pass the value of numbers when you are calling the method in main()
    static int sum2(int a, int b){
        int sum2 = a + b;
        System.out.println("The sum is : " + sum2);
        return sum2;

    }
}