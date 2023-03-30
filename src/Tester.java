/*
    The main purpose of this Tester class is to test unknown behavior
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Tester {

    public static void main(String[] args) {

        String[] id = TimeZone.getAvailableIDs();
//        System.out.println("In TimeZone class available Ids are: ");
//        for (int i=0; i<id.length; i++){
//            System.out.println(id[i]);
//        }

//        TimeZone zone = TimeZone.getDefault();
        TimeZone zone = TimeZone.getTimeZone("Asia/Kuala_Lumpur");
        String name = zone.getDisplayName();
        System.out.println("Display name for default time zone: "+ name + zone.getID());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        dtf.withZone(zone.getID());
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

    }
}
