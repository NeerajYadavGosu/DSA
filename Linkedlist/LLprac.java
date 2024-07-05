public class LLprac {
    Node head ;
    int size ;
    LLprac(){
        this.size = size ;
    }
    public void addFirst(int data){
        Node newNode = new Node( data);
        newNode.next = head ;
        head = newNode ;
        size++ ;

    }

    



    public class Node{
        int data;
        Node next ;

        Node(int data){
            this.data =data ;
            this.next = null ;

        }
        Node(int data , Node next){
            this.data = data ;
            this.next = next ;
        }


    }
    
}
