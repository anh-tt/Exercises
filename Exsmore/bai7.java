package Exsmore;
import java.util.Scanner;
public class bai7 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        System.out.println(n + " so nguyen to dau tien la: ");
        int i = 2;
        int dem = 0;
        while (dem < n) {
            if(soNgto(i)){
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
    public static boolean soNgto(int n){
        if(n < 2){
            return false;
        }
        int s = (int) Math.sqrt(n);
        for(int i = 2; i <= s; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
