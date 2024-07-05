public class secondlargestelement {
    public static void main(String[] args) {
        int a[] = { 1 , 2, 3 ,4 , 5};
        int large = secondlarge(a) ;
        System.out.println(large) ;
    }

    public static int secondlarge(int arr[]){
        int l = 1 , sl = -1 ;
        for( int i = 0 ; i < arr.length ; i++){
            
            if( l < arr[i]){
                l= arr[i] ;
            }
            
        }
        for( int j = 0 ; j<arr.length ; j++){
            if(arr[j]>sl && arr[j] != l){
                sl = arr[j] ; 

            }
        }
        return sl ; 
        
    }

    
}
