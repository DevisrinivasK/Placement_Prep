
import java.util.*;

class Divisors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        ArrayList<Integer> divisors =findDivisors(num);
        for(int d:divisors){
            System.out.println(d);
        }
        System.out.println();
        
    }
    public static ArrayList<Integer> findDivisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        int sqrtN=(int)Math.sqrt(n);
        for(int i=1;i<=sqrtN;i++){
            if(n%i==0)  divisors.add(i);
            if((n/i)!=0)    divisors.add(n/i);
        }
        Collections.sort(divisors);
        return divisors;
    }
}
