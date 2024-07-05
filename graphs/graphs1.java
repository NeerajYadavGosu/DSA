import java.util.*;
public class graphs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int  e= sc.nextInt();
        ArrayList<Integer> graph[] = new ArrayList[v];
        for(int i = 0 ; i<v ; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i = 0 ; i< e ; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();

            graph[s].add(d);
        }
        for(int i = 0 ; i<v ;i++){
            System.out.print(i+"-->");
            if(graph[i].isEmpty()){
                System.out.println("null");
            }
            else{
                for(int x : graph[i]){
                    System.out.print(x+" ");
    
                }
                System.out.println();
            }
            
        }

        sc.close();
    }
    
}
