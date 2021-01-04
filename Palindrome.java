public class Palindrome {
    public static void main(String[] args) {
        boolean result=isPalindrome(46758834);
        System.out.println(result);
    }
    public static boolean isPalindrome(int number){
        if(number<0){
            number=number*(-1);
        }
        int firstcopy=number;
        int reverse=0;

        while (firstcopy!=0){
            reverse+=(firstcopy%10);
            reverse*=10;
            firstcopy/=10;

        }
        reverse/=10;
        System.out.println(reverse);

        if(reverse==number){
            return true;
        }else {
            return false;
        }
    }
}
