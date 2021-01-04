________________________________________________________________________my solution_____________________________________________________________________________________________

public class Palindrome {
    public static void main(String[] args) {
        boolean result=isPalindrome(46758834);
        System.out.println(result);
    }
    public static boolean isPalindrome(int number){
        if(number<0){
            number=number*(-1);
        }
        int firstcopy=number;                             //151 is the number
        int reverse=0;

        while (firstcopy!=0){
            reverse+=(firstcopy%10);
            reverse*=10;                                 //in the last iteration, an additional 10 is multiplied with result
            firstcopy/=10;

        }                                                //1510 comes out to be the value of reverse after the loop. so we divide by 10
        reverse/=10;                                     //151 is the reverse now
        System.out.println(reverse);

        if(reverse==number){
            return true;
        }else {
            return false;
        }
    }
}

______________________________________________________________________optimum solution for the palindrome problem____________________________________________________________

 public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        while(number != 0){
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        return temp == reverse;
    }
