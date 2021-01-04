public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd=0;
        int small=0;
        int big=0;


        if(first>second){
            big=first;
            small=second;
        }else{
            big=second;
            small=first;
        }
        int n=small;

        while(n>0){
            if(small%n==0 && big%n==0){
                gcd=n;
                break;
            }
            n--;
        }
        return gcd;

    }
}
