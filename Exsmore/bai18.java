package Exsmore;
import java.util.Scanner;
public class bai18 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Nhap so phan tu cua mang: ");
     int n = input.nextInt();
     int[] a = new int[n];
     System.out.println("Nhap cac phan tu cua mang: ");
     for(int i = 0; i < n; i++){
        a[i] = input.nextInt();
     }
     int total = 0;
     for(int i = 0; i < a.length; i++){
        if(a[i] > 0 && a[i] < 5){
            total += a[i];
        }
    }   
    System.out.println("Tong cua ca phan tu lon hon 0 nho hon 5 la: " +total);
    }
}
