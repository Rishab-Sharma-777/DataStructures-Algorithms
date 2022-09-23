public class PythagoreanTriplet {
    public static void main(String args[]){
        int a=3,b=4,c=5;
        if(a>b && a>c){
            if(a*a==(b*b)+(c*c)){
                System.out.println("true");

            }
            else{
                System.out.println("false");

            }
        }
        else if(b>a && b>c){
            if(b*b==(a*a)+(c*c)){
                System.out.println("true");

            }
            else{
                System.out.println("false");

            }
        }
        else if(c>a && c>b){
            if(c*c==(b*b)+(a*a)){
                System.out.println("true");

            }
            else{
                System.out.println("false");

            }
        }
    }
}
