/*
Problem: Next Round
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/158/A
Rating: 800
Topic: Math
Date Solved: 24-06-2026
*/

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int kThScore = scores[k - 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] > 0 && scores[i] >= kThScore) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
