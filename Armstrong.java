import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number:");
         int num = sc.nextInt();
         int original = num;
         int temp = num ;
         int count = 0;
         int sum = 0;

         
         // counting the digist 
         while(temp>0){
            count++;
            temp = temp/10;

         }

         temp = num ; // reseting the temp 

         // checking if number is armstrong or not
         while(temp>0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp /10;
        }
        if(sum==original){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
    
}
