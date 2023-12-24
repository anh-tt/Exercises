package primenumb;
import java.util.Scanner;
public class sont {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("So lon nhat: ");
        int n = input.nextInt();
        System.out.println("Cac so nguyen to nho hơn " +n+ " la: ");
        if(n >= 2){
            System.out.print(2);
        }
        // cho i chạy
        for(int i = 3; i < n; i += 2){
            //kiểm tra xem a[i] có phải số nt ko
            if(primeNumber.isPrimeNumber(i)){
                System.out.print(" " + i);
            }
        }
    }
}
