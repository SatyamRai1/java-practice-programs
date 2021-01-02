public class PrimeNumber {
    // objective is to find all prime numbers between two given numbers

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int count=0;
        for(int i=5;i<=44;i++){
            boolean result=isPrime(i);
            if(result==true){
                count++;
                System.out.println(i+" is a prime number!");
            }
            if(count>=3){
                break;
            }

        }
    }

}
