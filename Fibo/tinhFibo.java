package Fibo;

public class tinhFibo {
    public static int khongDequyF(int n){
        int f0 = 0;
        int f1 = 1;
        int fn =  1;
        if( n < 0){
            return -1;
        }else if(n == 0 || n == 1){
            return n;
        }
        else{
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn;
        }
    }
    public static int dequyF(int n){
        if(n < 0){
            return -1;
        }else if( n == 0 || n == 1){
            return n;
        }else{
           return dequyF(n-1) + dequyF(n - 2);
        }
    }
}
