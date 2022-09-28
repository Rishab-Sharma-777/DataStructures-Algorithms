public class Pattern8 {
    public static void main(String args[]) {
        int n=5;
        int nsp=n-1;
        for(int r=0;r<n;r++){
            for(int c=0;c<nsp;c++){
                    System.out.print(" ");
                }
                System.out.print("*");
                nsp--;

            System.out.println();
        }
    }
}
