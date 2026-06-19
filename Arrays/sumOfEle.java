package Arrays;

import java.util.Scanner;

public class sumOfEle {
    public static int sumOfElements(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = sumOfElements(arr);
        System.out.println("Sum of Elements: " +res);

        sc.close();
    }
}
