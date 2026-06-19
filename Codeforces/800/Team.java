/*
Problem: Team
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/231/A
Rating: 800
Topic: Math
Date Solved: 19-06-2026
*/

import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int i = 0;
        while (i < n){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a + b + c >= 2){
                count++;
            }
            
            i++;
        }
        System.out.println(count);
        sc.close();
    }
}
