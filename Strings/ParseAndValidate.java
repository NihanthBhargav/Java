package Strings;

import java.util.*;

public class ParseAndValidate{
    public static int[] parseNumbers(String[] arr){
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            try{
                res[i] = Integer.parseInt(arr[i]);
            }
            catch(NumberFormatException e){
                res[i] = -1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        String[] input = {"10", "20", "abc", "30", "xyz"};
        int[] res = parseNumbers(input);
        System.out.println(Arrays.toString(res));
    }
}