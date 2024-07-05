import java.util.* ;
class bubble0{
    public static void main(String[] args) {
        int a[] = { 2 , 4 , 88 , 9 , 1 , 84 , 99   };
        bubblesort(a );
        System.out.println("bubble sorted array = "+ Arrays.toString(a));
}

public static void bubblesort(int arr[]){
    for( int i = 0 ; i< arr.length ; i++){
        boolean swap = false ;

        for(int j = 0 ; j< arr.length-1 ; j++){
            
            if( arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp ;
                swap = true ;
            }
        }
        if ( swap ){
            break ;
        }
        System.out.println("bubble sorted array = "+ Arrays.toString(arr));
    }
    }
}
