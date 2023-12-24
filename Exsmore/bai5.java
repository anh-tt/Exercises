package Exsmore;
import java.util.Scanner;
public class bai5 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("So thu nhat: ");
        double a = input.nextDouble();
        System.out.println("So thu hai: ");
        double b = input.nextDouble();
        System.out.println("So thu ba: ");
        double c = input.nextDouble();
        if((a+b > c) && (a+c > b) && (b+c > a) && a > 0 && b > 0 && c > 0){
            System.out.println("La 3 canh cua 1 tam giac");
        }else{
            System.out.println("Khong phai 3 canh cua 1 tam giac");
        }
    }
}
