package primenumb;

public class primeNumber {
    public static boolean isPrimeNumber(int n){
        //n < 2 -> ko là số nt 
        if( n < 2){
            return false;
        }
        //kiểm tra số nt nếu n >= 2
        int s = (int) Math.sqrt(n);
        for(int i = 2; i <= s; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
