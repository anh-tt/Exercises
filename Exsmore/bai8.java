package Exsmore;
import java.util.Scanner;
public class bai8 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        System.out.println(n + " so Fibo dau tien la:");
        for(int i = 0; i < n; i++){
                System.out.print(soFibo(i) + " ");
        }
    }
    public static int soFibo(int n){
        if(n < 0){
            return -1;
        }else if(n == 0 || n == 1){
            return n;
        }
        else{
            return soFibo(n -1) + soFibo(n-2);
        }
    }
    
}
