package ex_06_Ternary_Operator;

public class Lab064_TO {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x = 20;
        int y = 30;
        //system.out.println(Math.max(x,y));

        int min = x < y ? x :y;
        // int max = x >y ? x:y; //lab065
        //system.out.println(max);
        System.out.println(min);
    }
}
