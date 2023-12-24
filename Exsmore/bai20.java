package Exsmore;
import java.util.Scanner;
public class bai20 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so hang: ");
        int n = input.nextInt();
        System.out.println("Nhap so cot");
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Nhap cac phan tu cua mang:" );
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int total = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] % 5 == 0){
                    total += arr[i][j];
                }
            }
        } 
        System.out.println("Tong cac phan tu chia het 5 trong mang: " + total);       
    }
    
}
