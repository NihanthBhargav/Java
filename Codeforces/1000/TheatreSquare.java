/*
Problem: Theatre Square
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/1/A
Rating: 800
Topic: Math
Date Solved: 18-06-2026
*/

import java.util.*;

public class TheatreSquare{
    public static void solve(long n, long m, long a){
        long countN = (n + a - 1)/a;
        long countM = (m + a - 1)/a;

        long total = countN * countM;

        System.out.println(total);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        solve(n, m, a);

        sc.close();
    }
}