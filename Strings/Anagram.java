package Strings;

import java.util.*;

public class Anagram{
    public static boolean isAnagram(String s1 ,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean result = isAnagram(s1, s2);
        if(result){
            System.out.println("They are Anagrams!");
        }
        else{
            System.out.println("They are not Anagrams!");
        }

        sc.close();
    }
}