import java.util.* ;
class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int [rows][col];
        for( int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j< col ; j++){
                numbers[i][j]= sc.nextInt() ;

            }
        }
        System.out.println(Arrays.deepToString(numbers));


    }
    
}
