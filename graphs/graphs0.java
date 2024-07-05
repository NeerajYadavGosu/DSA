import java.util.* ;
class graphs0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();


        int graph [][]=  new int [v][v];

        for(int i = 0 ; i<e ; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if(v1>= v || v2>=v){
                
                 System.out.println("(" + v1 + " " + v2 + ") is an invalid edge in this graph");
            }
            else{
                graph[v1][v2]= 1 ;
                graph[v2][v1]= 1 ;
            }  
        }
        for(int i = 0 ; i<v ;i++){
            for(int j = 0 ; j<v; j++){
                if(graph[i][j]==1){
                    System.out.println(i+","+j+" :"+graph[i][j]+" ");

                }
                
            }
            
        }
        sc.close();
    }
}