public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10,22));
    }



    public static boolean hasSharedDigit(int number1,int number2){
        if((number1>=10 && number1<=99) && (number2>=10 && number2<=99)){
            int m,n,q,r;

            m=(number1)%10;
            number1/=10;
            n=(number1)%10;

            q=(number2)%10;
            number2/=10;
            r=(number2)%10;

            if(m==q || m==r || n==q || n==r){
                return true;
            }else {
                return false;
            }



        }else{
            return false;
        }
    }
}
