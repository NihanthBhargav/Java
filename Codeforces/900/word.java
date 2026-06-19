/*
Problem: Word
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/59/A
Rating: 800
Topic: Math
Date Solved: 19-06-2026
*/

import java.util.*;

public class word{
    public static String processWord(String s){
        int upperCount = 0;
        int lowerCount = 0;

        for (char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else{
                lowerCount++;
            }
        }

        return (upperCount > lowerCount) ? s.toUpperCase() : s.toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String res = processWord(s);

        System.out.println(res);

        sc.close();
    }
}