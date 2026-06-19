package Arrays;

public class avgEle {
    public static double averageOfElements(int[] arr){
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        double avg = (double)sum/n;

        return avg;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,7,8};

        double avg = averageOfElements(arr);
        System.out.printf("Average of Elements: %.2f\n" ,avg);
    }
}