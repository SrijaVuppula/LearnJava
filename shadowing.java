public class shadowing {
    static int x;
    public static void main(String[] args) {
        System.out.println(x); // this will print 0 because we did not initialise x at this stage & it will shadowed by the lower level value at line6
        int x;
//        System.out.println(x); // this will give error because scope will begin when the value is initialised
        x  = 56;
        System.out.println(x); // this will print the initialised x
        qwerty();
    }
    static void qwerty(){
        System.out.println(x); // this will print 0 because we cannot access initialise x value because of scoping
    }
}
