/*
Problem: Way Too Long Words
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/71/A
Rating: 800
Topic: Strings
Date Solved: 18-06-2026
*/

import java.util.*;

public class WayTooLongWords {
    public static String shorten(String word){
        int length = word.length();

        if(length > 10){
            return ""  +word.charAt(0) + (length - 2) + word.charAt(length - 1);
        }
        return word;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        for(String word : words){
            System.out.println(shorten(word));
        }
        sc.close();
    }
}
