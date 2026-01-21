import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int largest=0;
        int n1 = inp.nextInt();
        if (n1>largest){largest=n1;}
        int n2 = inp.nextInt();
        if (n2>largest){largest=n2;}
        int n3 = inp.nextInt();
        if  (n3>largest){largest=n3;}
        System.out.println(largest);

    }
}
