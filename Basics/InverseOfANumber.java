import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int pos=1;
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans+=(int) (pos*Math.pow(10, digit-1));
            n=n/10;
            pos++;
        }
        System.out.println(ans);

}
}
