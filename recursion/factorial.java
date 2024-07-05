import java.util.* ;
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int k = factorial1(n);
        System.out.println( " the factorial is " + k);
    }
    public static int factorial1(int n ){
        if(n ==1 ||n==0){
            return 1 ;
        }
        int k = factorial1( n-1) ;
        int h = n* k ;
        return h ;
   
    }
}
