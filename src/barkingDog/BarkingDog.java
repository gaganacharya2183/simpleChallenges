package barkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//         if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
//                return false;
//            }
//                return true;
        if(hourOfDay<0 || hourOfDay>23){
            return false;

        }else if(barking && (hourOfDay<8 || hourOfDay>22)){
            return true;

        }else if(!barking){
            return false;
        } else {
            return false;
        }
    }
}
