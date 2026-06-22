package Strings;

import java.util.*;

public class wordFrequency {
    public static void wordCount(String str){
        String[] words = str.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency: " +map);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        wordCount(str);
        sc.close();
    }
}
