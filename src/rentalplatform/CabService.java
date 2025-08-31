package rentalplatform;

import java.util.Date;
import java.util.Scanner;

public class CabService {
    Scanner sc = new Scanner(System.in);
    private int bookingId;
    private Date start_time;
    private Date dropTime;
    private String locationFrom;
    private String locationTo;

    public static void addBooking(int uid, String locationFrom, String locationTo){
        System.out.println("Ride booked from "+ locationFrom +"to" + locationTo);

    }
    public static void addDriver(int driverId, String driverName, String vehicleNumber ){
        DriverList.driver.add(new Driver(driverId,driverName,vehicleNumber));
    }

    void displayDriver(){
        for(Driver drivers : DriverList.driver){
            System.out.println(drivers);
        }
    }

}
