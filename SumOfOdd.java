public class SumOfOdd {

    public static void main(String[] args) {
        int result=sumOdd(1,2001);
        System.out.println(result);
    }

    public static boolean isOdd(int number){
        if(number<1){
            return false;
        }else{
            if(number%2==0){
                return false;
            }else{
                return true;
            }
        }

    }

    public static int sumOdd(int start, int end){
        if((start>0 && end>0) && (end>=start)){
            int sum=0;
            for(int i= start; i<=end;i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }
}
