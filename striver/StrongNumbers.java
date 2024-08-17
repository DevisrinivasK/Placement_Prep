import java.util.*;
public class StrongNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        if(isStrong(num))    System.out.println("Strong number");
        else    System.out.println("Not a Strong number");
        s.close();
        
    }
    public static boolean isStrong(int n){
        int originalNum=n;
        int sum=0;        
        while(n>0){
            int ld=n%10;
            sum+=factorial(ld);
            n=n/10;
        }
        return (originalNum==sum) ? true : false;

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
