package Exsmore;
import java.util.Scanner;
public class bai4 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen: ");
        int n = input.nextInt();
        if(n >= 0){
            System.out.println("Day la so nguyen duong");
        }else{
            System.out.println("Day la so nguyen am");
        }
    }
}
