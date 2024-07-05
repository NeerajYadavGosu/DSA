
import java.util.Arrays;

public class LinearsearchBinarysearch {
    public static void main(String[] args) {
        int a[] = { 1 ,2, 55 ,6, 89 , 5 };
        int search =55  ;
        //int res1 = linearsearch(a , search );
         int res2 = binarysearch(a , search);
       
       if(res2 == -1){
        System.out.println("Element not found");
       }else {
        System.out.println("element found at "+ res2);
       }

    }
    /*private static int linearsearch(int arr[] , int s){

        int steps = 0 ;

        for( int i = 0 ; i< arr.length ; i++){
            steps ++ ;
            if(arr[i]== s){
                System.out.println("it took " +steps + " steps");

                return i ;
            }
        }
        return -1 ; 

    }*/
        // for binary search
        //1. sort the given array 
        //2.initialize s = 0 e = n-1 
        //3.perform loop once it will reach s<=e
        //find mid val with formula mid = s+e/2 ;
        //compare mid value and search element if so return mid
        //if mid val is less than search element => s= m+ 1 
        //if mid val is greater than search element => e= m-1 ;

        private static int binarysearch(int arr[] , int s ){
            
            Arrays.sort(arr) ;
            int start = 0 ;
            int end = arr.length-1 ;
            int steps = 0 ;
            while ( start  <= end ){
                steps ++ ;
                int mid = (start + end) /2 ;
                if( s == arr[mid]){
                    System.out.println("it took " +steps + " steps");
                    return mid ;
                }
                else if(s< arr[mid] ){
                    end = mid -1 ;

                }
                else if (s> arr[mid]){
                    start = mid + 1 ;
                }


            }
            return -1 ; 
            

        }
}