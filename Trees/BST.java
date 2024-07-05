public class BST{

    private Node root ;
    public BST (){

    }
    public class Node {
        
        private int value ;
        private int height ;
        private Node left;
        private Node right ;
        public  Node(int value){
            this.value = value ;
            this.height = height ;
        }
        public int getValue(){
            return value ;
        }

    }
    
    public int height(Node node){
        if(root == null){
            return -1 ;
        }
        return node.height ;
        
    }
    public boolean IsEmpty(){
        return root == null ;
    }

    public void Insert(int value){
        root = Insert(value , root );

    }
    private Node Insert(int value , Node node){
        if(node == null){
            node = new Node( value);
            return node ;
        }
        if(value < node.value){
            node.left = Insert(  value , node.left);
        }
        if(value >= node.value){
            node.right =Insert( value , node.right);
        }
        node.height= Math.max(height (node.left), height(node.right))+ 1;
        return node ;

    }

    public void inorder(Node node){
        if(node== null){
            return ;
        }
        inorder(node.left);
        System.out.println(node.value+" ");
        inorder(root.right);
    }
    public boolean search(Node node , int value){
        if  (node == null){
            return false ;
        }
        if(node.value> value){
            return search(node.left , value);
        }
        else if(node.value< value){
            return search (node.right , value);
        }
        else{
            return true ;
        }

      
    }
    public boolean Balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true ;
        }
        return Math.abs(height(node.left) -height(  node.right)) <= 1 && balanced(node.left) && balanced(node.right) ;
    }

    public Node Delete(Node node , int value ){
        if(node.value> value){
            node.left = Delete(root.left , value);

        }
        else if (node.value  < value){
            node.right = Delete(node.right , value);
        }
        else{
            if(node.left== null && node.right==null){
                return null ;
            }

            if(node.left== null){
                return node.right ;
            }
            else if(node.right== null){
                return node.left ;
            }

            Node IS = inorderSuccessor(node.right);
            node.value = IS.value;
            node.right = Delete(node.right , IS.value) ;
            //left most of the right sub tree


        }
        return node ;
    }

    public Node inorderSuccessor(Node node){
        while(node.left != null){
            node = node.left ;
        }
        return node ;
    }
    
}

