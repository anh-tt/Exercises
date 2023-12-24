package UCLNBCNN;

public class otherway {
    public static int otherUc(int a, int b){
        int temp1 = a;
        int temp2 = b;
        while(temp1 != temp2){
            if(temp1 > temp2){
                temp1 = temp1 - temp2;
            }else{
                temp2 = temp2 - temp1;
            }
        }
        int ucmax = temp1;
        return ucmax;
    }
    public static int otherBc(int a, int b){
        return (a*b) / otherUc(a, b);
    }
}
