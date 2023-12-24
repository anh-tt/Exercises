package Fibo;
import java.util.Scanner;
import primenumb.primeNumber;
public class fibont {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        System.out.println("So Fibo la so nt va nho hon " +n+ " la: ");
        // for(int i = 0; i < n; i++){
        //     int fi = tinhFibo.dequyF(i);
        //     if(primeNumber.isPrimeNumber(fi) && fi < n){
        //         System.out.print(fi + " ");
        //     }
        // }
        int i = 0;
        while(tinhFibo.dequyF(i) < n){
            int fi = tinhFibo.dequyF(i);
            if(primeNumber.isPrimeNumber(fi)){
                System.out.print(fi + " ");
            }
            i++;
        } 
    }
}
