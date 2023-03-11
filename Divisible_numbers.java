import java.util.Scanner;

public class Divisible_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
         int num=sc.nextInt();
         if (num % 5==0){
             System.out.println("num is divisible by 5");

         }
         else if (num % 2==0){
             System.out.println("num is not divisible by 2");
             
         }
         else {
             System.out.println("enter another number");

         }

    }
}
