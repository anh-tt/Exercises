package ptbac2;
import java.util.Scanner;

public class eqt {
    // float a;
    // float b;
    // float c;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hệ số bậc 2 là: " );
        float a = eqt.input.nextFloat();
        System.out.println("Hệ số bậc 1 là: " );
        float b = eqt.input.nextFloat();
        System.out.println("Hằng số tự do là: " );
        float c = eqt.input.nextFloat();
        eqt.ptBac2(a, b, c);
        //ptBac2 e = new ptBac2(1f, 2f, 1f);
    }
    public static void ptBac2(float a, float b, float c){
        //ktra hệ số
        if(a == 0){
            if(b == 0){
                System.out.println("PT vô nghiệm");
            }else{
                System.out.println("PT có nghiệm x = " + (-c/b));
            }
            return;
        }
        //tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        //tính nghiệm
        if( delta > 0){
            x1 = (float)((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float)((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT có nghiệm x1 = " +x1 +" và x2 = " +x2);
        }else if(delta == 0){
            x1 = (float)(-b / (2*a));
            System.out.println("PT có nghiệm x1 = x2 = " +x1);
        }else{
            System.out.println("PT vô nghiệm");
        }
    }
}
