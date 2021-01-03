public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(500));

    }

    public static int sumDigits(int number){

        if(number>9){
            int sum=0;
            while(number!=0){
                sum+=number%10;
                number=number/10;
            }
            return sum;
        }else {
            return -1;
        }

    }
}
