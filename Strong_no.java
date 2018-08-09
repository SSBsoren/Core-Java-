//progam to calculate the strong number using Console class
//----145---!1+!4+!5=145
//Java Console is a simple debugging aid that redirects any System.out and System.err to the console window.
// It is available for applets running with Java Plug-in and applications running with Java Web Start.
import java.io.Console;
class Strong_no {
    static int fact(int num) {
        int f = 1;
        while (num != 0)
            f *= num--;

        return f;
    }


    public static void main(String args[]) {
        int bef, aft;
        Console c = System.console();
        System.out.println("Enter a Number :");
        int n = Integer.parseInt(c.readLine());


        bef = n;
        aft = 0;
        while (n != 0) {
            aft += fact(n % 10);
            n = n / 10;
        }
        if (bef == aft)
            System.out.println("Entered number is Strong Number.");
        else
            System.out.println("Entered Number is not a Strong Number.");

    }
}
