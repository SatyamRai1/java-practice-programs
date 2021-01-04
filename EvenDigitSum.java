public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(32580));
    }

    public static boolean isEven(int item){
        if(item%2==0){
            return true;
        }else{
            return false;
        }
    }


    public static int getEvenDigitSum(int number){
        if(number<0){
            return  -1;
        }else{
            int sum=0;
            int current=0;
            while (number!=0){
                current=number%10;
                if(isEven(current)){
                    sum+=current;
                }
                number/=10;

            }
            return sum;

        }
    }
}
