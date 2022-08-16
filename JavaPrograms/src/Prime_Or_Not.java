import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                count++;
        }
        if(count==1)
            System.out.println("It is a prime number");
        else{
            System.out.println("It is a composite number");
        }
    }
}
