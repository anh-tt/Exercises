package giaithua;

public class tinhGiaiThua {
    //tính gt bằng đệ quy
    public static long dequy(int n){
        if(n > 0){
            return n*dequy(n-1);
        }else{
            return 1;
        }

    }
    //tính gt không dùng đệ quy
    public static long khongDequy(int n){
        int gt = 1;
        if(n == 0 || n == 1){
            return gt; //trả về 1 nếu n = 0 || 1
        }else{
            for(int i = 2; i <= n; i++){
                gt = gt*i;// tính giai thừa khi n >= 2
            }
            return gt;
        }
    }
}
