public class Pattern2 {
    public static void main(String args[]) {
        int n=5;
        for(int r=1;r<=n;r++){
            int nst=n+1-r;
            for(int c=1;c<=nst;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
