package ex_05_TypeCasting;

public class Lab061_Typecasting_Used {
    public static void main(String[] args){
        int course = 100;
        float GST = 12.5f;
        // int total = couse=gst; //narrow implicit
        int total1 = course+(int) GST; //narrow -  explicit
        System.out.println(total1);

        float total2 = course+GST;  //widening auto implicit
        float total3= (float)course+GST; //widening explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}
