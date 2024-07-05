import java.util.*;

public class distinctele{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set =  new HashSet<>();
        while(n-->0){
            int a = sc.nextInt();
            set.add(a);
        }
        System.out.println(set.size());
    }
}