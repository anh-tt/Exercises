package UCLNBCNN;

public class euclid {
    //tính UCLN
    public static int euclidUc(int a, int b){
        if(b==0) return a;
        return euclidUc(b, a % b);
    }
    //tính BCNN
    public static int euclidBc(int a, int b){
        return (a * b) / euclidUc(a, b);
    }
}
