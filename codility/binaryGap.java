package codility;

public class binaryGap {
    public int solution(int N){
        String bString = Integer.toString(N, 2);
        System.out.println(bString);
        boolean started = false;
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < bString.length(); i++){
            String c = bString.substring(i, i+1);
            if(c.equals("1")){
                if(started){
                    if(count > maxCount){
                        maxCount = count;
                    }
                }
                count = 0;
                started = true;
            }
            if(c.equals("0")){
                count++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        binaryGap gb = new binaryGap();
        System.out.println(gb.solution(1041));

    }
}
