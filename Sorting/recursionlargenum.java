public class recursionlargenum {
    public static void main(String[] args) {
        
        int arr[] = { 1 , 4 ,45 , 99 , 43};
        int n = arr.length ;
        int maxele = findLargestNo(arr , n , arr[0], 0) ;
        System.out.println(maxele);



        
    }
    private static int findLargestNo(int[] arr  , int n , int max , int pos){
        if(pos ==n){
            return max ;
        }
        if(arr[pos]> max){
            max = arr[pos];
        }
        return findLargestNo(arr , n , max, pos+1);

        

    }
    
    
    

}
