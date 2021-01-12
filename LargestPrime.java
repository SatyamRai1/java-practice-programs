public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static boolean isPrime(int defendant){
        int count=0;
        for (int i=2;i<defendant/2;i++){
            if(defendant%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }else {
            return false;
        }
    }

    public static int getLargestPrime(int client){
        if(client<=1){
            return -1;
        }else{
            int largestprime=0;

            for(int i=2;i<client/2;i++){
                if(client%i==0){
                    boolean result=isPrime(i);
                    if(result){
                        largestprime=i;
                    }else{
                        continue;
                    }
                }
            }
            if(largestprime>0){
                return largestprime;
            }else{
                return -1;
            }
        }
    }

}
