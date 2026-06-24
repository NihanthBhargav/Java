package Strings;

import java.util.*;

public class InputValidation {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            if(age < 0){
                throw new IllegalArgumentException("Age cannot be negative");
            }

            System.out.println("Age is valid: " + age);
        }

        catch(NumberFormatException e){
            System.out.println("Please enter a valid number: ");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // sc.close();
    }
}
