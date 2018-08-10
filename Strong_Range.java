//Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
//Program to check Strong Number
//n=145=1!+4!5!=1+24+120

public class Strong_Range
{
    static int fact(int num)
    {
        int f=1;
        while(num != 0)
            f*=num--;
        return f;
    }
    public static void main(String args[])
    {
        int bef,aft,i,n;
        for(i=1;i<100000;i++)
        {
            n=bef=i;
            aft=0;
            while (n !=0)
            {
                aft+=fact(n%10);
                n=n/10;
            }
            if(bef==aft)
                System.out.println(bef);
        }
    }
}
