import java.util.* ;


class completeBT{
    public static void main(String[]  args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int tree [] = new int [n];
            for(int i = 0 ; i< n ; i++){
                tree[i] = sc.nextInt();

            }
            boolean flag = Is_BST(0 , n , tree);
            if(flag){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
       

    }
    boolean Is_BST(int index ,int size , int tree[]){
        if(index >= size ){
            return true ;
        }
        int left_max= Max_value(2*index+1 , n , tree);
        int right_min = Min_value(2*index+1 , n ,tree);

        if(left_max >= tree[index] || right_min <= tree[index]){
            return false ;
        }

        return Is_BST(2*index+1 , n , tree)&& Is_BST(2*index+2 , n , tree);


    }
    
}