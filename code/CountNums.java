public class CountNums {
    public static void main(String[] args) {
        int a = 2545;
        int count = 0;
        while (a > 0) {
            int b = a % 10;
            if (b == 5) {
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
