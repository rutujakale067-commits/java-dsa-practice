public class Array {
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
