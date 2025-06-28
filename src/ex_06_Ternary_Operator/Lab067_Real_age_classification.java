package ex_06_Ternary_Operator;

public class Lab067_Real_age_classification {
    public static void main(String[] args) {
        //age = 23;
        // age = 18 ->minor
        // age = 65 ->senior citizen
        int age = 76;
        String result = (age < 18) ? "minor" : (age <65) ? "Adult" : "senior";
        System.out.println(result);
    }
}
