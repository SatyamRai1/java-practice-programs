public class AllBasic {
    public static boolean isprime(int num1){
        boolean tillNowPrime= true;
        for(int i=2;i<=num1/2;i++){
            if(num1%i == 0){
                tillNowPrime= false;
                break;
            }else{
                continue;
            }
        }
        if(tillNowPrime == true){
            return true;
        }else{
            return false;
        }
    }


    public static int printFactorialRec(int num){
        if(num == 0){
            return 1;
        }
        return num*printFactorialRec(num-1);

    }
    public static int printFactLoop(int num){
        if(num==0){
            return 1;
        }else{
            int res = 1;
            for(int i=1;i<=num;i++){
                res*=i;
            }
            return res;
        }
    }


    public static void printFibonacci(int tilln){
        long num1 = 0;
        long num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        for(int i = 1; i<=tilln; i++){

            long sum=num1+num2;

            System.out.println(sum);

            num1=num2;
            num2=sum;
        }
    }


    public static int findGCD(int num1, int num2){
        // assuming the user doesnt provide values less than or equal to 1
        // to avoid code repetition, you can create a function and pass values accordingly; num1>num2 or vice versa
        int result=0;
        if(num1> num2){
            for(int i=1;i<=num2/2; i++){
                if(num2%i == 0){
                    result=i;
                }
            }
        }else{
            for(int i=1;i<=num1/2; i++){
                if(num1%i == 0){
                    result=i;
                }
            }
        }
        return result;
    }


    public static int findLCM(int num1, int num2){
        int result=0;
        if(num1>num2){
            for(int i=num1;i<=num1*num2;i++){
                if((i%num1==0) && (i%num2==0)){
                    result=i;
                    break;
                }
            }
        }else {
            for (int i = num2; i<= num1 * num2; i++) {
                if ((i % num1 == 0) && (i % num2 == 0)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }


 /*   public static long reverseANumber(long num){
        long rev=0;
        long copy=num;
        int i=1;
        while (copy!=0){
        i*=10;
        copy/=10;
        }
        i/=10;
        copy=num;

        while(copy!=0){
            rev+=((copy%10)*i);
            i/=10;
            copy/=10;
        }

        return rev;
    }
*/
    public static long reverseANumber(long num){
        long rev=0;
        while (num!=0){
            long remainder = num%10;
            rev = rev*10 +remainder;
            num/=10;
        }
        return rev;
    }


    public static void swap(int a, int b){
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }


    public static boolean Armstrong(long num){
        long copy=num;
        long sum=0;
        long rem=0;
        while(copy!=0){
            rem=(copy%10);
            sum+= (rem*rem*rem);
            copy/=10;
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isPalindromeNum(long num){
        long rev=0;
        long copy=num;
        while(num!=0){
            long remainder=0;
            remainder=num%10;
            rev=rev*10 + remainder;
            num/= 10;
        }

        if(rev == copy){
            return true;
        }else{
            return false;
        }
    }


    public static String reverseDaString(String str){
        char ch[]=str.toCharArray(); //using a char array and string mthod (toCharArray)
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];// here, we are assigning a new value to rev
        }
        return rev;
    }

// In java, agar koi character variable ko ek int value ko assign kr do toh uski ascii value store hogi
/*char ch1 = 'a';
    char ch2 = 'b';
    // variable that stores the integer value of the character
    int asciivalue1 = ch1;
    int asciivalue2 = ch2;
System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);

OUTUT- The ASCII value of a is: 97
       The ASCII value of b is: 98
*/

/*
    char a='a';
    int asciival=a;
        System.out.println("ascii val of a is:"+asciival);

    int asciival2=98;
    char b=(char)asciival2;                                           // notice here you have to typecast unlike above
        System.out.println("the character stored in asciival2 is: "+b);
*/




//in java, arrays also have .length method just like strings


        public static void binarySearch(int arr[], int first, int last, int key){
            int mid = (first + last)/2;
            while( first <= last ){
                if ( arr[mid] < key ){
                    first = mid + 1;
                }else if ( arr[mid] == key ){
                    System.out.println("Element is found at index: " + mid);
                    break;
                }else{
                    last = mid - 1;
                }
                mid = (first + last)/2;
            }
            if ( first > last ){
                System.out.println("Element is not found!");
            }
        }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("array after sorting:");
        for(int x= 0; x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }


}

