public class factrec {

    public static void main(String[] args) {
        int n = 9 ;
        int a = 0 ;
        int b = 1 ;
        System.out.print(" the fibnaci seq is :"+  a+" "+b+" ");
        Fibno(a ,b ,n-2);
    }
    public static void Fibno( int a , int b ,int n ){

        if(n == 0){
            return ;
        }
    
    int c = a+b ;
    System.out.print(c+" ");
    a = b;
    b = c;
    Fibno(a ,b ,n-1);

}
    
}
