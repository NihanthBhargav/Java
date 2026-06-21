/*
Problem: Beautiful Matrix
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/263/A
Rating: 800
Topic: Math
Date Solved: 21-06-2026
*/

import java.util.*;

public class BeautifulMatrix {
    public static int countMoves(int[][] matrix){
        int rows = 0;
        int cols = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    rows = i;
                    cols = j;
                }
            }
        }

        return Math.abs(rows - 2) + Math.abs(cols - 2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(countMoves(matrix));
        sc.close();
    }
}
