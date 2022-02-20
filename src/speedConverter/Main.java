package speedConverter;


import static speedConverter.SpeedConverter.printConversion;
import static speedConverter.SpeedConverter.toMilesPerHour;

public class Main {
    public static void main(String[] args) {
        long miles= toMilesPerHour(15);
        System.out.println("Miles= "+ miles);
        printConversion(1);


    }
}
