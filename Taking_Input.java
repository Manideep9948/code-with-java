import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Entering the input from the user");
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the nunber 1:");
//        int a=sc.nextInt(); it is for integer values
//        float a=sc.nextFloat();
//        System.out.println("Enter the number 2:");
//        int b= sc.nextInt();
//        float b=sc.nextFloat();
//        float sum=a+b;
//        System.out.println(sum);
//        boolean b1=sc.hasNextInt();//hasNextInt is use to bool the value true or false
//        System.out.println(b1);
//        String str=sc.next(); //input : mani is good output:mani because next only count one line after
        //space it dosnt count the world if you want ot print total string use sc.nextli();
//        System.out.println(str);
        String str=sc.nextLine();
        System.out.println(str);

    }
}
