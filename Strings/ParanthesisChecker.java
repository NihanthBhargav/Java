package Strings;

import java.util.*;

public class ParanthesisChecker {
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')){
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(isBalanced(str)){
            System.out.println("All the brackets are well-formed.");
        }
        else{
            System.out.println("The brackets are not well-formed.");
        }

        sc.close();
    }
}
