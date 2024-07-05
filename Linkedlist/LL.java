public class LL {
    private Node head ;
    private Node tail ;
    public int size ;
    public LL(){
        this.size= 0 ;
    }
    // INSERT AT FIRST 
    public void InsertFirst(int data){
        Node newNode = new Node (data);
        newNode.next= head ;
        head = newNode ;
        if(tail == null ){
            tail = head ;
        }
        size++ ;
    }
    // DISPLAY THE LINKEDLIST
    public void display(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data +"->");
            temp= temp.next ;
        }
        System.out.print("null");
    }
    // INSERT END

    public void InsertEnd(int data){
        if(tail == null){
            InsertFirst(data);
            return ;

        }
        Node newNode = new Node ( data);
        tail.next = newNode ;
        tail = newNode ;
        size++ ;
    
    }
    // INSERT AT A POSITION
    public void Insert(int data , int index){
        Node newNode = new Node ( data) ;
        if(index == 0){
            InsertFirst(data);
        }
        if(index == size){
            InsertEnd(data);
        }
        Node temp = head ;
        for(int i = 1 ; i < index ; i++){
            temp= temp.next;
            
            
        }
        // Or create the second method node here
        // Node newNode = new Node (int data , temp.next);
        newNode.next = temp.next;
        temp.next = newNode ;
        size++ ;
        
        
    }
    public void DeleteFirst(){
       head = head.next ;
       if(tail == null){
        head = null ;
       }
       size-- ;
    }
    public void DeleteEnd(){
        Node temp = head ;
        while(temp.next.next != null){
            temp = temp.next ;

        }
        temp.next = null ;
        size-- ;

    }
    public void Delete(int index){
        //0 1 2 3 4 5 6
        //a b c d e f g
        if(index == 0){
            DeleteFirst();

        }
        if(index == size ){
            DeleteEnd();
        }
        Node temp = head ;
        for(int i = 1 ;i< index ; i++ ){
            temp = temp.next ;
        }
        temp.next= temp.next.next ;
        size-- ;


    }
    private class Node{
        private int data;
        private Node next ;
        
        public Node(int data){
            this.data = data ;
            
        }
        public Node(int data , Node next){
            this.data = data ;
            this.next = next ;

        }
        

       
        

        
    }
    
}
