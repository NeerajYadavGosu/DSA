import java.util.ArrayList;
import java.util.Collections ;
class arraylist0 {
    public static void main(String[] args) {
        // we cant create int arraylist. we have to use Integer class in java . hence we create objects in arraylist.
        ArrayList<Integer> list = new ArrayList<Integer> ();
        

        list.add(2 );
        list.add(2);
        list.add(3);

        System.out.println(list);
        int element = list.get(0); // index
        System.out.println(element);
        // to add an element in the middle

        list.add(1 , 3);
        System.out.println(list);

        //set element ( modify element at index)
        list.set(0 , 5) ;
        System.out.println(list);
        System.out.println(list.contains(3));

        //delete element 
        list.remove(3 ) ;
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        //loops 
        for(int i = 0 ; i< list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list); 
        
        System.out.println(list);





    }
}