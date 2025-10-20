public class OverLoading {
    public static void main(String[] args) {
        A(65,234);
        A(65,234, 32);
        A(10,20, 30);
        B("JAVA JAVA JAVA");
        int C = B(3,6,9);
        System.out.println(C);
    }
    static void A(int a, int b){
        System.out.println(a+b);
    }
    static void A(int a, int b, int c){
        System.out.println(a + "," + b + "," + c);
    }
    static void B(String name){
        System.out.println(name);
    }
    static int B(int a, int b, int c){
        return a + b * c;
    }
}
