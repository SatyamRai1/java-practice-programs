public class Duration {
    public static void main(String[] args) {
        getDurationString(18000);
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes>=0 && (seconds>=0 && seconds<=59)){
            int totalseconds= seconds+ minutes*60;
            int finalhours= (totalseconds/3600);
            int remainingseconds= (totalseconds%3600);
            int finalminutes= remainingseconds/60;
            int fnalseconds= remainingseconds%60;
            String finalformat= finalhours+"h "+finalminutes+"m "+fnalseconds+"s ";
            return finalformat;

        }else{
            //rfrgrgr
            return "Invalid value";
        }

    }

    public static void getDurationString(int seconds){
        if(seconds>=0){
            int minutes= seconds/60;
            int remainingseconds= seconds%60;

            String answer=getDurationString(minutes,remainingseconds);
            System.out.println(answer);
        }

    }

}
