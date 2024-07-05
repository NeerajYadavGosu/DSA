public class queuemodel {
    int arr[] ;
    int rear , front ;
    int capacity ;
    queuemodel(int size){
        this.capacity = size ;
        this.arr = new int [capacity];

    }
    void enqueue( int data){
        arr[rear]= data ;
        rear ++ ;
    }
    void show (){
        for(int i=0 ; i<rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void dequeue(){
        
    }
}