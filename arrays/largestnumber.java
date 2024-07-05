class largestnumber{
    public static void main(String[] args) {
        // takes array of arggument and returns max element
        // TRAVERSAL  not using static means you have to create an instance in the class .
        int a[] = { 1, 2, 3 , 55, 88  , 43 } ;
        largestnumber l1 = new largestnumber() ;

        int  result = l1.largestnumber(a) ;
        System.out.println(result);

    }

    public  int largestnumber(int ar[]){
        int max = ar[0];
        for( int i = 0 ; i< ar.length ; i++){
            if( ar[i]> max){
                max = ar[i] ;
            }

            
        }
        return max ;
        
    }
}

// Naive Approach 
