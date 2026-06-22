/*
Problem: Helpful Maths
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/339/A
Rating: 800
Topic: Math
Date Solved: 22-06-2026
*/

import java.util.*;

public class HelpfulMaths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] parts = s.split("\\+");
        Arrays.sort(parts);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++){
            sb.append(parts[i]);

            if(i < parts.length - 1){
                sb.append("+");
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}