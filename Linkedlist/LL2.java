class LL2{
    Node Head ;
    Node Tail ;
    int size =0  ;

    LL2(){
        this.size = size;
    }

    public void InsertFirst(int data){
        Node newNode = new Node (data);
        newNode.next = Head ;
        Head = newNode ;

        if(Tail == null){
             
            Tail = newNode ;

        }
        size ++ ;
    }
    public void InsertEnd(int data){
        if(Tail == null){
            InsertFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        Tail.next = newNode ;
        Tail = newNode ;
        
        size ++ ;

    }
    public void Insert (int data , int index ){

        if(index == 0 ){
            InsertFirst(data);
            return ;
        }
        if(index == size-1 ){
            InsertEnd(data);
            return ;

        }
        
        Node temp = Head ;
        for( int i = 1 ; i< index ; i++){
            temp = temp.next;

        }
        Node newNode = new Node(data , temp.next);
        temp.next = newNode ;
        size ++ ;
        
       

    }
    public void DeleteFirst(){
        int val = Head.data ;
        Node Temp = Head ;
        Head = Temp.next ;
        if(Tail == null){
            Head = null ;
        }
        size-- ;

    }
    public void DeleteEnd(){
        Node temp = Head ;
        while (temp.next.next != null ){
            temp.next = null ;
            if(Tail == null){
                DeleteFirst();
                
            }
            size -- ;


        }

    }

    public void Delete (int index){
        if(index == 0){
            DeleteFirst();
        }
        if(index == size -1 ){
            DeleteEnd();
        }
        Node temp = Head ;
        for(int i = 1 ; i < index ; i++) {
            temp = temp.next ;
            
        }
        temp.next = temp.next.next ;
        size-- ;
    }

    public void Display(){
        if(size == 0 ){
            System.out.println("null");
        }

        Node temp = Head ;
        while ( temp.next != null){
            System.out.print(temp.data+ "->");
            temp = temp.next ;
            
        
        }
        System.out.print("null");
    }








    class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            

        }
        Node (int data , Node next){
            this.data = data ;
            this.next = next ;
        }

    }
}