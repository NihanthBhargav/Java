/*
Problem: Panagram
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/520/A
Rating: 800
Topic: Math
Date Solved: 23-06-2026
*/

import java.util.*;

public class Panagram {
    public static boolean isPanagram(String str){
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch >= 'a' && ch <= 'z'){
                int index = ch - 'a';

                if(!alphabet[index]){
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        if(n < 26){
            System.out.println("NO");
            sc.close();
            return;
        }
        else if(isPanagram(str)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
