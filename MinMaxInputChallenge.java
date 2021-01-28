import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int min=0,max=0;
        while(true){
            System.out.println("number daalo");
            boolean validinput=s.hasNextInt();
            if(validinput){
                int number=s.nextInt();
                s.nextLine();

                if(number>max){
                    max=number;
                }else if(number<min){
                    min=number;
                }
            }else{
                s.nextLine();
                break;
            }
            System.out.println("min = "+min);
            System.out.println("max = "+max);
        }
        s.close();

    }
}
