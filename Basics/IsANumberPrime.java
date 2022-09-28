import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t!=0){
            int n=scn.nextInt();
            boolean isPrime=true;
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
            t--;
        }

    }
        
}
