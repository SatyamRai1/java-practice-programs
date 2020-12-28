public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour>=0){
            long milesPerHour= Math.round(kilometersPerHour*(1/1.609));
            return milesPerHour;
        } else{
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>=0){
            long milesPerHour=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +" km/h = "+ milesPerHour + " mi/h");
        } else{
            System.out.println("Invalid Value");
        }
    }


}

