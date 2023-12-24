package UCLNBCNN;
import java.util.Scanner;
public class uclnbcnn {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("So nguyen duong A: ");
        int a = input.nextInt();
        System.out.println("So nguyen duong B: ");
        int b = input.nextInt();
        System.out.println("UCLN là: " + otherway.otherUc(a, b));
        System.out.println("UCLN là: " + otherway.otherBc(a, b));
    }
}
