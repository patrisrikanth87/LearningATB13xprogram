package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '8';
        char c6 = '1';
        char c7 = '(';

        //escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        System.out.println("srikanthpatri");
        System.out.println("srikanth"+new_line+"patri");
        System.out.println("srikanth"+tab_line+"patri");
        System.out.println("srikanth"+back_space+"patri");
        System.out.println("srikanth is old"+carriage_return+"patri");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

    }
}
