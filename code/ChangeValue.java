import java.util.Scanner;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// takes input one by one and shows array after each entry and then immediately modifies the first 3 elements
        int[] arr1 = new int[4];   // size of array
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();//user inputs elements here
            System.out.println("Array elements: " + Arrays.toString(arr1));
            change(arr1);   //calling the change method
            System.out.println("Modified Array: " + Arrays.toString(arr1));
        }

// takes the entire array input first and then modifies the array only once at last
        int[] arr2 = new int[4];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
            System.out.println("Array elements: " + Arrays.toString(arr2));
            change(arr2);
            System.out.println("Modified Array: " + Arrays.toString(arr2));
    }
    public static void change ( int[] nums){
            nums[0] = 19;
            nums[1] = 76;
            nums[2] = 45;
        }
}
