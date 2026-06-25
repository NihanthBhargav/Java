package Arrays;

import java.util.*;

public class Intersection{
    public static int[] intersect(int[] nums1,int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        int[] res = new int[set2.size()];
        int i = 0;

        for(int num : set2){
            res[i++] = num;
        }

        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersect(nums1, nums2);

        System.out.println(Arrays.toString(res));
    }
}