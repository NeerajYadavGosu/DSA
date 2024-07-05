import java.util.*;
class Pair{
    int vertex;
    int weight;
    Pair(int v,int w){
        this.vertex = v;
        this.weight = w;
    }
public class graphs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Pair> graph[] = new ArrayList[v];
        for(int i=0 ; i<v ; i++){
            ArrayList<Pair> item = new ArrayList<>();
            graph[i] = item;
        }
        for(int i=0 ; i<e ; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            graph[s].add(new Pair(d,w));

        }
        for(int i=0; i<v ; i++){
            System.out.print(i + " ->");
            for(Pair p: graph[i]){
                System.out.print("("+p.vertex+","+p.weight+")");
            }
            System.out.println();
            
        }
    }
    
}