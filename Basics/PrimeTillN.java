import java.util.Scanner;
public class PrimeTillN {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int n=scn.nextInt();
        for(int i=t;i<=n;i++){
            boolean isPrime=true;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
            
        }

    }

}
