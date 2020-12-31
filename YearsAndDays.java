public class YearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else {
            long years=minutes/525600;
            int remaining_minutes= (int)(minutes%525600);
            int days= remaining_minutes/1440;
            String minutes_string = ""+minutes;
            if (minutes<10) {
                 minutes_string = "0" + minutes;
            }
            String years_string=""+years;
            if (years<10) {
                years_string = "0" + years;
            }
            String days_string=""+days;
            if (days<10){
                days_string="0"+days;
            }

            System.out.println(minutes_string+" min = "+years_string+" y "+"and "+days_string+" d");
        }
    }


}