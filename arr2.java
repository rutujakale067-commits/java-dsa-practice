public class arr2 {

    public static void main(String[] args) {
        int arr[][] = {{10,20},
                       {30,40,50,60},
                       {70,1,2,3,4,5,6}, 
                       {90,80},
                       {27} };
        for(int row = 0; row<=arr.length-1;row++){
            for(int col = 0 ; col<=arr[row].length-1;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();  // elements in row in different  line

        }               
    }
}