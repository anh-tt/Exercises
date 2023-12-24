package Exsmore;
//import java.util.Scanner;
/**
 * bai12
 */
public class bai12 {
    public static void main(String[] args) {
        System.out.println("Cac so tu 1 den 100 ket thuc bang so 0 la:");
        int i = 1;
        do {
            if(i % 2 == 0 && i % 5 == 0 ){
                System.out.print(i + " ");
            }
            i++;
        } while (i >= 1 && i <= 100);
        
    }
    
}