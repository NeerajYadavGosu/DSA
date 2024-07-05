 import java.util.* ;
 class BinaryTree{
    private Node root ;
    public BinaryTree (){
    }
    public void populate(Scanner sc){
        System.out.println("Enter the root node value");
        int value = sc.nextInt();
        Node newNode = new Node ( value) ;
        root = newNode ;
        populate(sc , root);
    }
    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to enter left of "+ node.value+"true/false4");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value of left of "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value+"true/false");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value of right of "+node.value);
            int value = sc.nextInt();
            node.right = new Node (value);
            populate(sc, node.right);
        } 
    }
    private static class Node{
        private int value ; 
        Node left ;
        Node right ;
        Node (int value){
            this.value = value ;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
    }  
}

