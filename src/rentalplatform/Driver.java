package rentalplatform;

public class Driver extends Cab{

    private int driverId;
    private String driverName;
    private String vehicleNo;

    public Driver(int driverId, String driverName, String vehicleNo) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehicleNo = vehicleNo;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Override
    public int getCabId() {
        return super.getCabId();
    }
}
