public class Prime_Or_not_using_functions {
    public static void checkPrimeOrNot(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }

    }

    public static void main(String[] args) {
        checkPrimeOrNot(10);
    }
}
