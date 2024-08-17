import java.util.Scanner;
public class Factorialrecursive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        System.out.println(factorial(num));
        s.close();        
    }
    public static int factorial(int n){
        if(n==0||n==1)  return 1;
        return n*factorial(n-1);
    }
    
}
