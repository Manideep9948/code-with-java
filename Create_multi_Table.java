import java.util.Scanner;
//Creating multiple table using do while loop
public class Create_multi_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,range;
        System.out.println("Enter the number ");
        num=sc.nextInt();
        System.out.println("Enter the range");
        range=sc.nextInt();
        int i=1;
//        do {
//            System.out.println(num+"*"+i+"="+num*i);
//            i++;
//        }while (i<=range);

        //using for loop
//
        //using while loop
        while (i<=range){
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }



    }
}
