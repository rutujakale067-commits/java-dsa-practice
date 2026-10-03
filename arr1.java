//Printing Elements consist in an array

public class arr1 {
    public static void main(String[] args) {
     int [] arr = {10,20,30,40};
     int n = arr.length;   
     int sum = 1;
     for(int i = 0; i <=n-1;i++){
        int value = arr[i]; //assigning array element to an variablr value
        sum = sum * value; // sum of all elements
        
     }
     System.out.println(sum);
    }
    
}
