public class Binomial_Coefficient {
    public static int factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++)
            f=f*i;
        return f;
    }
    public static int binomialCoefficient(int n, int r){
        int n_factorial=factorial(n);
        int r_factorial=factorial(r);
        int n_r_factorial=factorial(n-r);

        return n_factorial/(r_factorial*n_r_factorial);
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5,2));
    }
}
