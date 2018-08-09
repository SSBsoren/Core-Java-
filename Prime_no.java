// Program to calculate the Prime number with better time complexity
//here the input will take from the keyboard using Scanner class.
import java.util.Scanner;
public class Prime_no
{
    public static void main(String args[])
    {
        //Scanner class to take the input from keyboard
        Scanner sc=new Scanner(System.in);
        int num , i,c=0;
        System.out.print("Enter an Integer :");
        num=sc.nextInt();

        for (i =2;i<num/i;i++)
        {
            if (num % i==0)
            {
                c=1;
                break;
            }
        }
        if (c==0)
            System.out.println("It is a Prime Number");
        else
            System.out.println("It is not a Prime Number");
    }

}
