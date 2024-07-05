import java.util.* ;
public class twoDarray1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int search = sc.nextInt();
        int [][] matrix = new int [r][c];
        for( int i = 0 ; i< r ; i++){
            for( int j =0 ; j<c; j++){
                matrix[i][j]= sc.nextInt();
                
        
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for( int i = 0 ; i< r ; i++){
            for( int j =0 ; j<c; j++){
               
                if(matrix[i][j]== search){
                    System.out.println( "row :"+i+"col :"+j);
                }
                


    }
    

    }
    sc.close();
}
}
