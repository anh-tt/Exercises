package Exsmore;
import java.util.Scanner;
public class bbsort {
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
        //bbSort(a);
        //printAns(a);


        /**thực hiện bubble sort
         * in ra kết quả sắp xếp theo thứ tự tăng dần
         */
     for(int i = 0; i < a.length; i ++){
         for(int j = 0; j < a.length - 1 - i; j++){
             if(a[j] > a[j+1]){
                 int temp = a[j];
                 a[j] = a[j+1];
                 a[j+1] = temp;
             }
         }
     }
     for(int i = 0; i < a.length; i++){
         System.out.print(a[i] + " ");
     }
    }
    /**
    * hàm bubble sort
    */
    //public static void bbSort(int a[]){
    // for(int i = 0; i < a.length; i ++){
    //  for(int j = 0; j < a.length - 1 - i; j++){
    //      if(a[j] > a[j+1]){
    //          int temp = a[j];
    //          a[j] = a[j+1];
    //          a[j+1] = temp;
    //      }
    //  }
    //}

    /**hàm in kết quả ra màn hình
    * a: mảng cần in
    */
    // public static void printAns(int a[]){
    //     for(int i = 0; i < a.length; i++){
    //         System.out.print(a[i]+" ");
    //     }
    //     System.out.println();
    // }
}
