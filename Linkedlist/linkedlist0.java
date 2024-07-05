class linkedlist0{
    public static void main(String[] args) {
        

        //LinkedList<Integer> list = new LinkedList<>();
        //list.add(34);
        //Syste.m.out.println(list);

        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(5);
        list.InsertEnd(556);
        list.Insert(66 , 1);
        list.Insert(66 , 1);
        list.Insert(66 , 1);
        //list.DeleteFirst();
        //list.DeleteEnd();
        list.Delete(4);
        list.display();
        System.out.println();


        System.out.println(list.size);

    


        



        

    }
}