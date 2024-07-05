public class checkarraysorted {
    public static void main(String[] args) {
        int a [] = { 1 , 2, 33, 444 , 55} ;
        boolean check = checksorted(a);
        System.out.println(check) ;
    }
    public static boolean checksorted( int arr[]){
        boolean flag = true ;
        for( int i = 0 ; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false ;

            }

        }
        return flag ;
    }
}
