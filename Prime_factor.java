//Program to print Prime factors of a Number
// if the input number is 12, then output should be “2 2 3”. And if the input number is 315, then output should be “3 3 5 7”.
import java.util.Scanner;

public class Prime_factor
{
    static boolean prime(int num) {
        int i;
        boolean c = true;

        for (i = 2; i <= num/i; i++)
        {
            if (num%i==0)
            {
                c=false;
                break;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        //boolean val
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num=sc.nextInt();

        System.out.print("Prime factors are : ");
        for(i=2;i<=num/2;i++)
        {
            if (num%i==0)
                if (prime(i)==true)
                    System.out.println(" "+i);
        }
    }
}
