import java.util.*;
class priorityQ{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        while (n--> 0){
            pq.offer(sc.nextInt());
        }
        while (!pq.isEmpty()){
            System.out.println(pq.peek()+" ");
            pq.poll();
        }
    }
}