import java.util.Scanner;
class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Methodsss is a different java file, called that function in this java file
        Methodsss.sum();
        new StringExample();
    }
public static class StringExample {
    public StringExample() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String qwerty = input.nextLine();
        String text = greeting(qwerty);
        System.out.println("hey" + " " + text);
    }
}
    private static String greeting(String name) {
        return "Hello, " + name + "!";
    }

    public static void sum() {
        Methodsss.sum();
    }
}

