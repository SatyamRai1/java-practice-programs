public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 ||smallCount<0 || goal<0){
            return false;
        }else{                                                             //else1 start

            int bigPacketCount=bigCount;

            if(bigPacketCount*5 >goal){
                while((bigPacketCount*5)>goal){
                    bigPacketCount--;
                }
                if((bigPacketCount*5)+smallCount>=goal){
                    return true;
                }else {
                    return false;
                }


            }else if(bigPacketCount*5==goal){
                return true;
            }else {

                if(goal-(bigCount*5) <=smallCount){
                    return true;
                }else {
                    return false;
                }


            }


        }                                                                 //else1 end

    }
}
