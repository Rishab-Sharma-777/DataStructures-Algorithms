public class Pattern5 {
    public static void main(String args[]) {
            int n=5;
            int row=1,nrow=n,nstars=1,nspaces=n/2;
            while(row<=nrow){
                for(int c=1;c<=nspaces;c++){
                    System.out.print(" ");
                }
                for(int c=1;c<=nstars;c++){
                    System.out.print("*");
                }
                System.out.println();
                if(row<=n/2){
                    nstars=nstars+2;
                    nspaces=nspaces-1;
                }
                else{
                    nstars=nstars-2;
                    nspaces=nspaces+1;
                }
                row++;
            }
            
        }
    }
