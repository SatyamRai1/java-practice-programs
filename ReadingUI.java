import java.util.Scanner;

public class ReadingUI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter your name");
 //       String name = scan.nextLine();

        System.out.println("Enter your year of birth");
        int year=scan.nextInt();   // checking behaviour. Normally, this should be done after ensuring value in the bucket is indeed an integer
        System.out.println("before hasNext");
        boolean isYearOfBirthInteger = scan.hasNextInt();

/*
        while (!isYearOfBirthInteger) {
            scan.nextLine();
            System.out.println(" Invalid input, Enter your year of birth as integer, please");
            isYearOfBirthInteger = scan.hasNextInt();

        }
*/
 //      int year = scan.nextInt();

        System.out.println(isYearOfBirthInteger);
        System.out.println(year);
        scan.close();
    }
}
//the scan.nextInt()/ scan.nextLine() etc methods consume the input type(integer number or line) from the
//bucket(not yet sure what input "stream" means yet). if the bucket is empty,it expects user to input a value


//the hasNextInt() explicitly asks the user for an input and returns a boolean value based on its type.
//the entered value remains in the bucket and can further act as input for nextline/nextint...etc methods
// if you want the bucket to be emptied of this value/ consume that line using scan.nextline() without assigning
// it to any other variable like we've done in line 18 to eliminate invalid value entered by the user

