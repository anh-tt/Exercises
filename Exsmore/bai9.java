package Exsmore;
import java.util.Scanner;
public class bai9 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so thu nhat: ");
        double a = input.nextDouble();
        System.out.println("Nhap so thu hai: ");
        double b = input.nextDouble();
        System.out.println("a^b = " +a+"^"+b+" ="+" "+Math.pow(a, b));
    }

    
}
