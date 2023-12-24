package Exsmore;
import java.util.Scanner;
public class selectsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        System.out.println("Mang sap xep theo thu tu tang dan: ");
        for(int i = 0; i < a.length; i++){
            //tìm vị trí nhỏ nhất
            int min = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
