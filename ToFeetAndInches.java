public class ToFeetAndInches {
    public static void main(String[] args) {
        double result=calcFeetAndInchesToCentimeters(100);
        System.out.println(result);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, double inches){
        if(feet>=0 && (inches>=0 && inches<=12)){
            double totalinches=inches+(feet*12);
            double centimeters= totalinches*2.54;
            return centimeters;
        }else{
            return -1;
        }
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            int totalfeet= (int)(inches/12);
            System.out.println(totalfeet);
            double remaininginches= inches%12;
            System.out.println(remaininginches);
            return calcFeetAndInchesToCentimeters(totalfeet,remaininginches);

        }else{
            return -1;
        }
    }

}
