package ex_08_IF_Condition;

import java.util.Scanner;

public class Lab080_if {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18) ;{  //if(condition){
           /* if (condition){ // code to be executed if the condition is true
            }
            else {
                // do this
            }
            */

            System.out.println("Allowed to vote!");
        }
    }
}
