package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {

        //## Input from users (in java)
        //1. **CLI - command line.**
        //2. **Scanner **
        //3. BufferReader
        //4. Files. ...

        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canivote = age >= 18 ? "yes" : "no";
        System.out.println(canivote);

    }
}
