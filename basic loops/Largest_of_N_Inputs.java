import java.util.Scanner;

public class Largest_of_N_Inputs {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int largest=0;
        System.out.print("total numbers:");
        int count = inp.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("enter number" + i);
            int placeholder = inp.nextInt();
            if (placeholder > largest) {
                largest = placeholder;
            }
        }
        System.out.println("largest number: " + largest);

    }
}
