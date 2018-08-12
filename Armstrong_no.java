//Program to calculate the Armstrong number//
//(1**3)+(5**3)+(3**3)=153//
import java.util.Scanner;

public class Armstrong_no {
    public static void main(String args[])
    {
        int num1 ,num2 ,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int a =sc.nextInt();

        num2=a;
        num1=0;

        while(a !=0)
        {
            s=a%10;
            num1+=(s*s*s);
            a=a/10;
        }
        if (num1==num2)
            System.out.println(num2+" Entered Number is an Arnstring Number.");
        else
            System.out.println(num2+"Entered Number is not an Armstrong Number.");


    }
}
