package Exsmore;
import java.util.Scanner;
public class bai15 {
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        int[] a = new int[n];
        // int max = 0;
        // int min = 0;
        System.out.println("Nhap phan tu cua mang: ");
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int min = a[0];
        for(int i = 0; i < a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Gt nho nhat: " +min);
        int max = a[0];
        for(int i = 0; i < a.length; i ++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Gt lon nhat: " +max);
    
    }  
}

 
