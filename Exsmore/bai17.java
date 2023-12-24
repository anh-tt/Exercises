package Exsmore;
import java.util.Scanner;
public class bai17 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan  tu mang: ");
        int n = input.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Nhap gia tri can tim");
        int x = input.nextInt();
        int count = 0; 
        for(int i= 0; i < n; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("Gia tri " + x + " xuat hien " +count+ " lan");
    }
    
}
