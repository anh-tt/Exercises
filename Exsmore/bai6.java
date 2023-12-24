package Exsmore;
import java.util.Scanner;
public class bai6 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so tien luong: ");
        int n = input.nextInt();
        System.out.println("Salary: " +n+ " trieu");
        if(n >= 15){
            System.out.println("Tax: " +((n*30)/100)+ " trieu");
            System.out.println("Actual salary: " +(n-((n*30)/100))+ " trieu");
        }else if(7 <= n && n < 15){
            System.out.println("Tax: " +((n*20)/100)+ " trieu");
            System.out.println("Actual salary: " +(n-((n*20)/100))+ " trieu");
        }else{
            System.out.println("Tax: " +((n*10)/100)+ " trieu");
            System.out.println("Actual salary: " +(n-((n*10)/100))+ " trieu");
        }
    }
}
