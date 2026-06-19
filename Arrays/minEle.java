package Arrays;

public class minEle {
    public static int minelement(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Minimum Element: " +(minelement(arr)));
    }
}
