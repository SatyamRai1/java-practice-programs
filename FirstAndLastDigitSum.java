public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(firstAndLastDigitSum(92847985));
    }

    public static int firstAndLastDigitSum(int number){
        if(number>0){
            int last_digit = number%10;
            int first_digit = 0;

            while (number!=0){
                first_digit=number%10;
                number/=10;
            }
            return last_digit+first_digit;

        }else{
            return -1;
        }
    }
}
