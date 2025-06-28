package ex_05_TypeCasting;

public class Lab059_TypeCating_Narrowing {
    public static void main(String[] args){
        int val = 200;
       // byte b = val; //Narrowing (int->byte)- implicit casting is not allowed
        byte b1 = (byte)val;
    }
}
