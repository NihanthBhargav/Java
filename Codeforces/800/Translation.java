/*
Problem: Translation
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/41/A
Rating: 800
Topic: Math
Date Solved: 22-06-2026
*/

import java.util.*;

public class Translation{
    public static void areTranslations(String s, String t){
        // char[] s1 = s.toLowerCase().toCharArray();
        // String tlower = t.toLowerCase();

        // String rev = "";

        // for (int i = s.length() - 1; i >= 0; i--){
        //     rev += s1[i];
        // }

        // if(rev.equals(tlower)){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");   
        // }

        String rev = new StringBuilder(s.toLowerCase()).reverse().toString();
        if(rev.equals(t.toLowerCase())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        areTranslations(s, t);

        sc.close();
    }
}