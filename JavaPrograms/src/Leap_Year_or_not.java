import java.util.*;
public class Leap_Year_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0) ||((year%100==0) &&(year%400==0))){

               System.out.println("It is a Leap Year");

        }else{
            System.out.println("Not a leap year");
        }
    }
}
