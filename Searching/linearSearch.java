package Searching;

public class linearSearch {
    public static int searchElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {94,32,12,45,67};
        int target = 45;

        System.out.println(searchElement(arr, target));
    }
}
