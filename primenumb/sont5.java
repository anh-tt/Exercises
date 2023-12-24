package primenumb;

public class sont5 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Cac so nt co 5 chu so la: ");
        for(int i = 10001; i < 99999; i+=2){
            if(primeNumber.isPrimeNumber(i)){
               System.out.println(i + " ");
               count++; 
            }
        }
        System.out.print("Co tat ca " +count+ " so nt co 5 chu so");
    }
    
}
