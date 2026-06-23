/*
Problem: Twins
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/160/A
Rating: 800
Topic: Math
Date Solved: 23-06-2026
*/


import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            totalSum += coins[i];
        }
        
        // Sort in descending order
        Arrays.sort(coins, Collections.reverseOrder());
        
        int mySum = 0;
        int count = 0;
        
        // Pick the largest coins first
        for (int i = 0; i < n; i++) {
            mySum += coins[i];
            count++;
            
            // Check if our sum is strictly greater than the remainder
            if (mySum > (totalSum - mySum)) {
                break;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}