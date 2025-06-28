package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        //age to vote
        int age = 10;
        String canivote = age>18 ? "yes" : "no";
        System.out.println(canivote);
        // #### Syntax
        //- result = condition ? expression1 : expression2;
        //- **condition**: This is a boolean expression that is evaluated.
        //- **expression1**: This expression is executed if the condition is true.
        //- **expression2**: This expression is executed if the condition is false.
    }
}
