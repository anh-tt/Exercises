package total;
import java.util.Scanner;
public class tongchuso {
    private static final int D_10 = 10;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so can tinh: ");
        int n = input.nextInt();
        System.out.println("Tong cac chu so la: " +tongchuso.tongChuSo(n));
    }
    public static int tongChuSo(int n){
        int total = 0;
        do{
            total = total + n % D_10;
            n = n / D_10;
        }while(n > 0);
        return total;      
    }
}
