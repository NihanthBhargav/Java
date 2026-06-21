/*
Problem: Boy or Girl
Platform: Codeforces
Link: https://codeforces.com/problemset/problem/236/A
Rating: 800
Topic: Math
Date Solved: 21-06-2026
*/

import java.util.*;

public class BoyOrGirl {
    public static String determinegender(String name){
        int distinct = 0;

        for (int i = 0; i < name.length(); i++){
            boolean found = false;

            for (int j = 0; j < i; j++){
                if(name.charAt(i) == name.charAt(j)){
                    found = true;
                    break;
                }
            }

            if(!found){
                distinct++;
            }
        }

        if(distinct % 2 == 0){
            return "CHAT WITH HER!";
        }
        else{
            return "IGNORE HIM!";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println(determinegender(name));

        sc.close();
    }
}
