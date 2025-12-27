import java.util.* ;

public class BubbleSort {
    public static void bubbleSort ( int arr[]) {
        int n = arr.length ;
        // outer loop for number of turns
        for ( int turn = 0 ; turn <n-1 ;turn ++) {
            int swap = 0 ;
            // inner loop for comparision
            for ( int j=0 ; j < n-1-turn ; j++) {
                if ( arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    swap ++ ;
                }
            }
            // if no swap happened means array is sorted
            if ( swap == 0 ) {
                break ;
            }
            
        }
    }
    public static void main ( String args[]) {
        int arr[] = { 4 , 3 , 2 , 5 , 1 } ;
        bubbleSort ( arr ) ;
        System.out.println("The sorted array is: ") ;
        for ( int i=0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    
}
