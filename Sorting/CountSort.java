import java.util.* ;

public class CountSort {
    public static void countSort ( int arr[]) {
        int n=arr.length ;
        int largest = Integer.MIN_VALUE ;

        for ( int i=0 ; i < n ; i++) {
            largest = Math.max( largest , arr[i]) ;
        }

        int count[] = new int[ largest + 1 ] ;
        for ( int i=0 ; i < n ; i++) {
            count[ arr[i] ] ++ ;     /* we are adding from 0 to n elements in the new index as ,
                                       we get indexes of given elements .*/  
        }
        int j=0 ;
        for ( int i = 0 ; i < count.length ; i ++) {  //its goes into the count array
            while ( count[i]>0) {    // to check elements present in that coun array index
                arr[j] =i ;          // j - sorted arry index where we put the elements of index i of count array
                j++ ;                // position shifted in sorted array
                count[i]-- ;         // the counts decreasing

            }
        }
    }
    public static void main ( String args[]) {
        int arr[] = { 1 , 4 , 1 , 3 , 2 , 4 , 3 } ;
        countSort ( arr ) ;
        System.out.println("The sorted array is: ") ;
        for ( int i=0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    
}
