public class PrintNEven {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        int count=0;
        int sum=0;
        if((end>=start) && (end>0 && start>0)){
            while (start<=end){
                start++;
                if(isEven(start)){
                    sum+=start;
                    count++;
                }else{
                    continue;
                }
                System.out.println(start+" is even!");

                if(count>=5){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    public static boolean isEven(int number){

            if(number%2==0){
                return true;
            }else{
                return  false;
            }
    }
}
