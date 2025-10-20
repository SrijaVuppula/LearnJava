import java.util.Scanner;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array elements:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array elements: " + Arrays.toString(arr));
        Arrays.fill(arr, 6);
        System.out.println("Array with one element: " + Arrays.toString(arr));

    }
}
