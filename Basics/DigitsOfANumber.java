import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;

        int power=1;
        while(temp>=10){
        temp/=10;
        power*=10;
        }
        temp=n;
        while(power!=0){
            int digit=temp/power;
            System.out.println(digit);
            temp=temp%power;
            power=power/10;
        }
        
    }
}
