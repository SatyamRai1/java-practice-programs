public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(400);
    }


    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }else if(number==0){
            return 1;
        }else{
            int count=0;
            while(number!=0){
                    count++;
                    number/=10;
            }
            return count;
        }
    }

    public static int reverse(int num){
        int reverse=0;
        while(num!=0){
            reverse+=num%10;
            reverse*=10;
            num/=10;
        }
        reverse/=10;
        return reverse;
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int reversed=reverse(number);
            String sentence="";
            int difference=(getDigitCount(number)-getDigitCount(reversed));
            if(number==0){
                sentence+="Zero";
            }

            int digit=0;
            while(reversed!=0){
                digit=reversed%10;
                switch(digit){
                    case 0:
                        sentence+="Zero ";
                        break;
                    case 1:
                        sentence+="One ";
                        break;
                    case 2:
                        sentence+="Two ";
                        break;
                    case 3:
                        sentence+="Three ";
                        break;
                    case 4:
                        sentence+="Four ";
                        break;
                    case 5:
                        sentence+="Five ";
                        break;
                    case 6:
                        sentence+="Six ";
                        break;
                    case 7:
                        sentence+="Seven ";
                        break;
                    case 8:
                        sentence+="Eight ";
                        break;
                    case 9:
                        sentence+="Nine ";
                        break;
                }
                reversed/=10;
            }
            if (difference>0){
                for(int i=difference;i!=0;i--){
                    sentence+="Zero ";
                }
            }

            System.out.println(sentence);

        }
    }
}
