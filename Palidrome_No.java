//Palindrome number in java: A palindrome number is a number that is same after reverse.
// For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
// It can also be a string like LOL, MADAM etc.
import java.util.Scanner;

public class Palidrome_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,rev,a;

        System.out.print("Enter a Number :");
        num=sc.nextInt();

        rev=0;
        a=num;
        while (num !=0)
        {
            rev=(rev*10)+(num%10);
            num=num/10;

        }
        if(a==rev)
            System.out.println("Entered number is Palindrome.");
        else
            System.out.println("Entered Number is not Palindrome.");
    }
}
