package Exsmore;
import java.util.Scanner;
public class bai10 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = input.nextInt();
        //int count = 0;
        System.out.println("Cac so la uoc cua " +n+ " là: ");
        // for(int i = 1; i < n; i++){
        //     if(n % i == 0){
        //         System.out.print(i + " ");
        //     }
        //     count++;
        // }
        int i = 1;
        while(i < n ){
            if( n % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
