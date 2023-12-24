package Exsmore;
import java.util.Scanner;
public class bai13 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so thu nhat: ");
        int a = input.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int i = a;
        do {
          if(i % 2 == 0){
            sum1 +=i;
          }  
          i++;
        } while (i<=b);
        System.out.println("Tong chan = " + sum1);
        int j = a;
        do {
            if(j % 2 != 0){
                sum2 +=j;
            }
            j++;
        } while (j<=b);
        System.out.println("Tong le = " + sum2);
        // for(int i = a; i <= b; i++){
        //     if(i % 2 == 0){
        //         sum1 += i;
        //     }
        // }
        // System.out.println("Tong chan = " + sum1);
        // for(int j = a; j <= b; j++){
        //     if(j % 2 != 0){
        //         sum2 += j;
        //     }
        // }
        // System.out.println("Tong le = " + sum2 );
        //int i = 0;
        // do {
        //     if(i % 2 == 0){
        //         sum += i;
        //         System.out.println("Tong chan = " + sum);
        //     }else{
        //         sum +=i;
        //         System.out.println("Tong le = " + sum);
        //     }
        //     i++;
        // } while (a <= i  && i <= b && a < b && a >= 0);
    //     do {
    //         if(j % 2 != 0){ 
    //             System.out.println("Tong le = " + sum);
    //         }
    //         j++;
    //     } while (a<=j && j<=b);5
    }
}
