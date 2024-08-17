import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        System.out.println(factorial(num));
        s.close();        
    }
    public static int factorial(int n){
        int fact=1;
        if(n==0||n==1)  return fact;
        else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }
    }
    
}

