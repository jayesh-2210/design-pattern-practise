package CarRentalSystem;

import CarRentalSystem.Enums.VehicleStatus;
import CarRentalSystem.Enums.VehicleType;

public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private VehicleStatus vehicleStatus;
    private VehicleType vehicleType;
    private int dailyRate;
    private int hourlyRate;
    private int cc;
    private int engineCapacity;

    public Vehicle(int vehicleId, String vehicleNumber, VehicleStatus vehicleStatus, VehicleType vehicleType, int dailyRate, int hourlyRate, int cc, int engineCapacity) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleStatus = vehicleStatus;
        this.vehicleType = vehicleType;
        this.dailyRate = dailyRate;
        this.hourlyRate = hourlyRate;
        this.cc = cc;
        this.engineCapacity = engineCapacity;
    }

}
