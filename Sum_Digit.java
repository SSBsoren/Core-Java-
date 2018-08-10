import java.util.Scanner;

public class Sum_Digit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int num,sum;
        System.out.print("Enter a Number :");
        num=sc.nextInt();

        sum=0;

        while (num !=0) {
            sum += (num % 10);
            num = num / 10;
        }
        System.out.println("Sum of digits :"+sum);
    }
}
