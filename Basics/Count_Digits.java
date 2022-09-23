public class Count_Digits {
    public static void main(String args[]){
        int n=12345,count=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Count is: "+count);
    }
}
