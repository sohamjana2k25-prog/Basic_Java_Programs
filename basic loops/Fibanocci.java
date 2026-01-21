import java.util.Scanner;

public class Fibanocci  {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter total no of fib num you want ");
        int count = inp.nextInt();
        int lastval = 1;
        int seclastval = 0;
        int placeholder=0;
        System.out.println("the Fibonacci series containing your input numbers is:");
        System.out.println(seclastval);
        System.out.println(lastval);
        for (int i = 1; i <= count-2; i++) {
            placeholder = lastval;
            lastval=lastval+seclastval;
            seclastval=placeholder;
            System.out.println(lastval);
        }
        System.out.print("And obtained digit is :");
        System.out.println(lastval);
    }
}
