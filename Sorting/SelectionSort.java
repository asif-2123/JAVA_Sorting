import java.util.* ;

public class SelectionSort {
    public static void selectionSort( int arr[]) {
        int n = arr.length ; 
        // outer loop for number of turns
        for ( int turn = 0 ; turn < n-1 ; turn++) {
            int minPos = turn ;
            // inner loop for finding the minimum element index
            for ( int j = turn+1 ; j < n ; j++) {
                if ( arr[minPos] > arr[j]) {       
                    minPos = j ;              // updating minPos
                }
            }
            // swap
            int temp = arr[turn] ;
            arr[turn] = arr[minPos] ;
            arr[minPos] = temp ;
        }
    }
    public static void main ( String args[]) {
        int arr[] = { 5 , 4 , 1 , 3 , 2} ;
        selectionSort ( arr ) ;
        System.out.println("The sorted array is: ") ;
        for ( int i=0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
}
