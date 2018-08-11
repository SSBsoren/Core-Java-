//Program to calculate Multiplication table .

import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"\t"+"*"+"\t"+i+"\t"+"="+"\t"+(num*i));
        }
    }
}
