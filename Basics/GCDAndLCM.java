import java.util.Scanner;

class GCDAndLCM{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int product=n1*n2;
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        System.out.println(gcd);
        int lcm=product/gcd;
        System.out.println(lcm);

    }
}