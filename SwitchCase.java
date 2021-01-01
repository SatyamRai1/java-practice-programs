public class SwitchCase {
    public static void main(String[] args) {
        char switchvariable='a';
        switch (switchvariable){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("nothing good was found");
                break; // this isn't really necessary
        }
    }
}
