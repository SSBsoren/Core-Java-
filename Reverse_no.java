//Program to wtite a program to reverse a number.
//345=543
import java.util.Scanner;

public class Reverse_no
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, rev;
        System.out.print("Enter a Number : ");
        num=sc.nextInt();

        rev=0;

        while(num !=0)
        {
            rev =(rev*10)+(num%10);
            num=num/10;
        }
        System.out.println("Reverse of the Number : "+rev);
    }

}
