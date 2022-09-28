import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        for(int i=2;i*i<n1;i++){
            while(n1%i==0){
                System.out.println(i);
                n1=n1/i;
            }
        }
        if(n1!=1){
            System.out.println(n1);
        }
    }
}
