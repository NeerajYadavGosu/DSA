public class height {

    int Height(Node temp){
        if(temp == null){
            return -1 ;
        }
        int left = Height(temp.left);
        int right = Height(temp.right);

        return Math.max(left,right)+1 ;
        
    }
    
}
