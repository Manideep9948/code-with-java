import java.util.Scanner;

public class Bus_tiket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bus no for root");
        System.out.println("Enter the bus no");
        String num=sc.next();
        if (num=="253"){
            System.out.println("Maheshwaram");
        }
        else if (num=="253k"){
            System.out.println("kandikoor");

        }else if (num=="540"){
            System.out.println("Amangal");
        }else {
            System.out.println("Enter the correct root");
        }



    }
}
