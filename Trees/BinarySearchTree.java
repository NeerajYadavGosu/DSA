public class BinarySearchTree {
    Node root ;
    BinarySearchTree(){

    }
    public class Node{
       private int value ;
       public Node left ;
       public Node right ;
       private int  height ;
       public  Node(int value){
            this.value = value ;
            this.height = height; 
        }

    }
    public static Node Insert(Node root ,int value, ){
        if(root == null){
            return new Node(value);
        }
        if(value < root.value){
            root.left = Insert(root.left ,  value);
        }
        if(value >= root.value){
            root.right  = Insert(root.right ,  value);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5 , 1 , 3, 4 , 2  , 7};
        Node root = null ;
    }

    
}
