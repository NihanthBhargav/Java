package Strings;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupanagrams(String[] str){
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : str){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] word = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupanagrams(word));
    }
}
