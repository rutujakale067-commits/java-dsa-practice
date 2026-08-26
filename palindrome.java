import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int original = n;
        int reverse=0;
        for(int i = 0; i>0;i++){
            int lastdigit = n%10;
            reverse = reverse * 10 +lastdigit;
            n = n/10;

        }
        if(reverse == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

        }


    }
    

