import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println(hcf(num1,num2));        
    }
    public static int hcf(int n1, int n2){
        int hcfV = 0;
        for(int i=1; i<= (int) Math.min(n1,n2);i++){
            if((n1%i==0)&&(n2%i==0))    hcfV=i;
        }
        return hcfV;
        
    }
    
}
