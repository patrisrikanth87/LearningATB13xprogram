package ex_08_IF_Condition;

public class Lab081_If_p1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18) {
            System.out.println("yes you can go to goa");
        }
        else {
            System.out.println("not allowed to goa");
        }
    }
}
