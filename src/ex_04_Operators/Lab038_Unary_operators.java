package ex_04_Operators;

public class Lab038_Unary_operators {
    public static void main(String[] args) {
        //unary operator
        int a = +10;  //output  10
        //a = 10 optional
        int a1 = -110;  //output  -110
        int result = a+a1;
        System.out.println(a);  //o/p 10
        System.out.println(a1); // -110
        System.out.println(result); //-100

        int b = -1;
        b = b+1;// output 0
        System.out.println(b);

    }
}
