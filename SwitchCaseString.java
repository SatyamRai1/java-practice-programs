public class SwitchCaseString {
    public static void main(String[] args) {
        String petspecies= "chimpanzee";

        switch(petspecies){

            case "dog":
                System.out.println("you have a dog.");
                break;
            case "cat":
                System.out.println("you have a cat.");
                break;
            case "hamster":
                System.out.println("you have a hamster.");
                break;
            case "chimpanzee": case"alligator": case "tiger": case "python":
                System.out.println("You'll die soon!");
                break;
            default:
                System.out.println("You're broke!");
        }

    }
}
//use .toUpperCase() / .toLowerCase() in string matching if the text does not have to be case sensitive. 
