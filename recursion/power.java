import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = power(n , p);
        System.out.println( " the power is " + k);
    }
    public static int power(int n , int p){
        
        
        

        if(p==0){
            return 0 ;
        }
        return  n* power( n , p-1) ;

        

    }
}
