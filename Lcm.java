//Program to find LCM of two no
import java.util.Scanner;

public class Lcm
{
    static int g;
    static int gcd(int a ,int b)
    {
        int r,c;
        c=a%b;
        if (c==0)
            g=b;
        else
            gcd(b,c);
        return g;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the two Numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int hcf=gcd(a,b);
        int lcm=(a*b)/hcf;
        System.out.println("LCM("+a+","+b+")="+lcm);
    }
}
