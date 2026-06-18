/*
Problem: Watermelon
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/4/A
Rating: 800
Topic: Math
Date Solved: 18-06-2026
*/

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();

        if(w > 2 && w % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
