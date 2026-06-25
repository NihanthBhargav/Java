package Arrays;

import java.util.*;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] res = intersect(nums1, nums2);

        System.out.println(Arrays.toString(res));
    }
}
