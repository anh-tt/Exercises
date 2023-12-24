package primenumb;
import java.util.Scanner;
public class firstprimenumbs {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        System.out.println(n+ " so nguyen to dau tien la: ");
        int i = 2;//tìm số nt bắt đầu từ 2
        int dem = 0;// đếm số các số nt
        while(dem < n){//bắt đầu đếm
            if(primeNumber.isPrimeNumber(i)){//ktra số nt khi n >= 2
                System.out.print( i + " ");
                dem++;
            }
            i++;
        }
    }
    
}
