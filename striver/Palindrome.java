import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        if(isPalindrome(n)) System.out.println("Palindrome");
        else    System.out.println("Not a palindrome");

    }
    public static boolean isPalindrome(int n){
        int originalNum=n;
        int revNum=0;
        while(n>0){
            int ld=n%10;
            revNum=(revNum*10)+ld;
            n=n/10;
        }
        if(originalNum==revNum) return true;
        else    return false;
    }
}
