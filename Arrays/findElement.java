package Arrays;

public class findElement{
    public static int findnumber(int[] arr){
        // int n = arr.length + 1;
        // boolean found = false;
        // for (int i = 1; i <= n; i++){
        //     found = false;
        //     for(int j = 0; j < arr.length; j++){
        //         if(arr[j] == i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

        int n = arr.length + 1;

        long totalSum = (long)n * (n + 1)/2;
        long actualSum = 0;

        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }

        return (int)(totalSum - actualSum);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("The missing number is: " + findnumber(arr));
    }
}