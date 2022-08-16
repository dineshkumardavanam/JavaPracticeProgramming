import java.util.Scanner;

public class Continue_Statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n%10==0)
                continue;
            System.out.println(n);
        }
        //System.out.println("you have entered a multiple of 10, So it got skipped");
    }
}
