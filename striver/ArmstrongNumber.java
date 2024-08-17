import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        if(isArmStrong(num))    System.out.println("Armstrong number");
        else    System.out.println("Not a Armstrong number");
        s.close();
    }
    public static boolean isArmStrong(int n){
        int originalNum=n;
        int temp=n;
        int digits=0;
        int sum=0;
        while(temp!=0){
            temp=temp/10;
            digits++;
        }
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,digits);
            n=n/10;
        }
        return (originalNum==sum) ? true : false;

    }
    
}
