package megaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if(kilobytes<0){
            System.out.println("Invalid Value");
        }else {
            int convertedMegabytes= kilobytes / 1024;
            int remainder = kilobytes % 1024;
            System.out.println(kilobytes
                    +" KB = " +convertedMegabytes+
                    " MB and "+remainder + " KB");
        }

    }

}
