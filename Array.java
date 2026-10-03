/*public class Array {
    public static void main(String[] args) {
       // Declaration
       int arr[];
      
       // Memory allocation

        arr  = new int[3];

        // Initialization

        int brr [] = {10,20,30,40,50};

        //length

        int n = brr.length;
        for(int index = 0; index<=n-1; index++){   // to access any data fromman array it is accesible through index 
            System.out.println(brr[index]);  // brr where values are stored and index means the printing the number according to there index like from 0 to n-1
        }

}
}


        */


//For each loop 
/*public class Array {

    public static void main(String[] args) {
        int arr[] = {10,20,30};
        for(int val : arr){

            System.out.println("Values in an array : " + val);

        }
    }
}

*/

//Taking input in an array 
/*import java.util.*;
public class Array {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int arr [] = new int[1];    // before taking inout from user firstly we havr to intilize it 
  
       System.out.println("Enter an element");

       arr [0] = sc.nextInt();   // taking input from the user

       System.out.println(arr[0]);  





    }
}
    */


// taking input ftom user using loop

import java.util.*;
public class Array {

    public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);
       int arr[] = new int[5];
       int n = arr.length;

       System.out.println("Enter an elements into your array:");
       for(int i = 0; i<n;i++){
        System.out.print(" Elemet " + i + " are: ");
        arr[i] = sc.nextInt();
       }
       for(int val : arr){
        System.out.println("Your Array contains:");
        System.out.println(val);
       }



    }
}