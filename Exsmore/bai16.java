package Exsmore;
import java.util.Scanner;
public class bai16 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("So phan tu cua mang: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for(int i = 0; i< n; i++){
            a[i] = input.nextInt();
        }
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total = a[0] + a[n-1];
        }
        System.out.println("Tong so dau va so cuoi la: " + total);
    }
    
}
