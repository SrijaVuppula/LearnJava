import java.util.Arrays;

public class VarAgrs {
    public static void main(String[] args) {
        qwerty(34,435,6546,6745,2323,456,234,342,765,908,231,786);
        qwerty2("one","two","three","four","five","six","seven","eight","nine","ten");
        qwerty3('a','b','c','d','e','f','g','h');
        multiple(54,86,"fruit","color",'v','u','g','a');
        qwerty4(43,645,12,"dog","cat","animals",'a','m','j');
    }
    static void qwerty(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void qwerty2(String ...b){
        System.out.println(Arrays.toString(b));
    }
    static void qwerty3(Character ...c){
        System.out.println(Arrays.toString(c));
    }
    static void multiple(int a, int b, String d, String e, char ...c) { // in an array - all elements must be of the same type.
        System.out.println("Integers: " + a + ", " + b);
        System.out.println("Strings: " + d + ", " + e);
        System.out.println("Characters: " + Arrays.toString(c));
    }
    static void qwerty4(Object...g){   //object can print an array with a mix different arguments
        System.out.println(Arrays.toString(g));
    }
}
