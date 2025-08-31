package rentalplatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        CabService service = new CabService();
        do{
            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Display Drivers");
                    service.displayDriver();
                    break;
                case 2:
                    System.out.println("Enter User Id: ");
                    int Uid = sc.nextInt();
                    System.out.println("Departure: ");
                    String from = sc.next();
                    System.out.println("Destination: ");
                    String to = sc.next();
                    CabService.addBooking(Uid,from, to);
                    break;
                case 3:
                    System.out.println("Add Driver");
                    System.out.println("Enter Driver Id: ");
                    int driverId = sc.nextInt();
                    System.out.println("Driver Name: ");
                    String driverName = sc.next();
                    System.out.println("Vehicle No:  ");
                    String VehicleNo = sc.next();
                    CabService.addDriver(driverId,driverName,VehicleNo);
                    break;
                case 4:
                    System.out.println("Exit the app");
                    isRunning = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }while (isRunning);

    }
    public static void menu(){
        System.out.println("-----------------Welcome to cab rental platform----------------");
        System.out.println("1.Display Drivers \n 2.Book Ride \n 3.Add Driver \n 4.Exit App");
    }
}
