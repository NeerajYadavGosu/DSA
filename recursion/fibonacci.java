public class fibonacci {

    public static void main(String[] args) {
        int n = 9 ;
        Fibon(n);
        
    }
    public static void Fibon(int n){

        System.out.print(0+" "+1+" ");
        int count1 =0 ;
        int count2 = 1 ;
        for(int i = 0 ; i< n-2; i++){
            int h =count1 + count2 ;
            System.out.print(h+" ");
            count1 = count2 ;
            count2 = h ;
        }
    }   
}
