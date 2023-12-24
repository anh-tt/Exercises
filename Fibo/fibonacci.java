package Fibo;
import java.util.Scanner;
public class fibonacci {
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Nhap so so hang Fibo dau tien:");
        int n = fibonacci.input.nextInt();
        System.out.println(n + " so Fibo dau tien la: ");
        for(int i = 0; i < n; i++){
            System.out.print(tinhFibo.dequyF(i) + " ");
        }
    }
}
