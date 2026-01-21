import java.util.Scanner;

public class Count_appearance_in_num  {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter base number ");
        int sum = inp.nextInt();
        System.out.println("enter number to scan in base number");
        int placeholder= inp.nextInt();
        int count=0;
        int rem=0;
        if(sum!=placeholder){
            while(sum>0){
                rem=sum%10;
                if(rem==placeholder){
                    count++;
                }
                sum=sum/10;

            }
        }
        System.out.println("The number of appearance of  "+placeholder+" is "+count);

    }
}
