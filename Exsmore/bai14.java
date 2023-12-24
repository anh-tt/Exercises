package Exsmore;
import java.util.Scanner;
public class bai14 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap nam: ");
        int year = input.nextInt();
        System.out.println("Nhap thang: ");
        int n = input.nextInt();
        switch (n) {
            case 1,3,5,7,8,10,12:
                System.out.println("Thang " +n+ " co 31 ngay");
                break;
            case 4,6,9,11:
                System.out.println("Thang " +n+ " co 30 ngay");
                break;
            case 2:
                if(year % 4 ==0){
                    System.out.println("Thang " +n+ " co 29 ngay");
                }else{
                    System.out.println("Thang " +n+ " co 28 ngay");
                }
                break;
            default:
                break;
        }
    }
}
