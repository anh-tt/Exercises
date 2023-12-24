package ptbac2;

public class ptBac2 {
    float a;
    float b;
    float c;
public ptBac2(float a, float b, float c){
    this.a = a;
    this.b = b;
    this.c = c;
    this.giaPtBac2();
}
    public void giaPtBac2(){
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
