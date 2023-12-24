package Exsmore;
import java.util.Scanner;
public class insertsort {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Nhap so phan tu cua mang: ");
     int n = input.nextInt();
     int[] a = new int[n];
     System.out.println("Nhap cac phan tu cua mang: ");
     for(int i = 0; i < n; i++){
        a[i] = input.nextInt();
    }
     System.out.println("Mang sau khi sap xep: ");
     
     /*Thực hiện sắp xếp chọn
      *có thể đưa vào hàm: public static void inserSort(int a[]){}
      */
    for(int i = 1; i < a.length; i++){
        int temp = a[i];
        int j = i-1;
        while (j >= 0 && a[j] > temp) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = temp;
    }
    for(int i = 0; i < a.length; i++){
        System.out.print(a[i] + " ");
    }
  }
}
