import java.util.Scanner;

public class Practice_set_4 {
    public static void main(String[] args) {
        //it is and error becaus a=11 it is a assig  you should give == to check conditiion
//        int a=10;
//        if(a=11){
//
//        }

        //question 2
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of chemistry");
        m1=sc.nextByte();
        System.out.println("Enter the marks of maths");
        m2=sc.nextByte();
        System.out.println("Enter the marks of biology");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("you average percentage is "+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you are promoted");
        }
        else {
            System.out.println("sorry you have not promoted");

        }
    }
}
