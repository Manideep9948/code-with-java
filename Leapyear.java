import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the year");
//        int year=sc.nextInt();
//        if (year%4==0){
//            System.out.println("This year is leap year" + year);
//
//        }
//        else {
//            System.out.println("This is not a leap year" + year);
//        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website name-->");
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("it is an orginazation website");
        }
        else if (website.endsWith(".com")){
            System.out.println("this is a commercial website");

        }else if (website.endsWith(".in")){
            System.out.println("this is a india website");

        }



    }
}
