//write a programm to cal percentage of a give students in cbsc exam his marks from
//five subjects must be taken as input from the keyword marks are out of 100
import java.util.Scanner;
public class Total_percentage_of_marks {
    public static void main(String[] args) {
        System.out.println("SSC to total average marks calculater::");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks in Telugu:");
        int Telug=sc.nextInt();
        System.out.print("Enter the marks in Hindi:");
        int Hindi=sc.nextInt();
        System.out.print("Enter the marks in English");
        int English=sc.nextInt();
        System.out.print("Enter the marks in Social:");
        int Social=sc.nextInt();
        System.out.print("Enter the marks in science:");
        int science=sc.nextInt();
        System.out.print("Total marks of subjects is:");
        int sum=Telug+Hindi+English+Social+science;
        System.out.println(sum);
        int average=sum/5;
        System.out.println("overall percentage out of 100 is S:"+average);
    }
}
