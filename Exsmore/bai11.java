package Exsmore;
import java.util.Scanner;
public class bai11 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("So thu nhat: ");
        int a = input.nextInt();
        System.out.println("So thu hai: ");
        int b = input.nextInt();
        System.out.println("Cac so chia het cho 3 va 5 trong khoang "+a+" va "+b+" la:");
        int i = 1;
        while(a > 0 && a < b && a <= i && i <= b ){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    
}
