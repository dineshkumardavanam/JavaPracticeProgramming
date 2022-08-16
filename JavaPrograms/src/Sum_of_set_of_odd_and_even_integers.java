import java.util.Scanner;

public class Sum_of_set_of_odd_and_even_integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        int sumE;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                evenCount+=n;
            }else{
                oddCount+=n;
            }
        }
    }
}
