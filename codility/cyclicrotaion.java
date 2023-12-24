package codility;
import java.util.Arrays;
import java.util.Scanner;
public class cyclicrotaion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang");
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
          a[i] = input.nextInt();
        }
        int m = input.nextInt();
        for(int j = 0; j < m; j++){
            int temp = a[n - 1];//gán temp = số hạng cuối
            for(int i = n - 1; i > 0; i--){
                 a[i] = a[i - 1];
                }
                a[0] = temp;//đảo số hạng cuối lên đầu
            System.out.println(Arrays.toString(a));
        }

    }
}

