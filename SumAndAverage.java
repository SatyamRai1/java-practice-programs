import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum=0,howmany=0;
        double average=0;

        Scanner sc=new Scanner(System.in);
        while(true){
            boolean valid=sc.hasNextInt();
            if(valid){
                howmany++;
                sum+=sc.nextInt();
                sc.nextLine();
                average=(double)sum/howmany;

            }else{
                sc.nextLine();
                break;
            }

        }
        sc.close();
        System.out.println("SUM = "+sum+" AVG = "+Math.round(average));
    }
}
