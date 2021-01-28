import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=1;
        int sum=0;

        while (count<=3){

            System.out.println("Enter number #"+count);
            boolean validInput= scanner.hasNextInt();
            if(validInput){
                count++;
                sum+=scanner.nextInt();
                scanner.nextLine();
            }else{
                System.out.println("Invalid Value");
                scanner.nextLine();

            }

        }
        System.out.println("the sum of the numbers you entered = "+sum);
        scanner.close();

    }
}
// as a general rule, always write a scanner.nextLine() after a scanner.nextInt()

// or use a scanner.nextLine to take the number input and convert into suitable datatype by using
//Integer.parseInt() etc methods