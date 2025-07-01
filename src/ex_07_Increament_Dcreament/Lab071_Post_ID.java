package ex_07_Increament_Dcreament;

public class Lab071_Post_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // - value is incremented first and then stored in the result.

        System.out.println(a);

        // post increment = print and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
