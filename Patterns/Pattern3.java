public class Pattern3 {
    public static void main(String args[]) {
        int n=5;
        for(int r=1;r<=n;r++){
            int nstars=r;
            int nspaces=n-r;
            for(int c=1;c<=nspaces;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=nstars;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
