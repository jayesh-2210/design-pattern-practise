package CarRentalSystem;

import java.util.List;

import CarRentalSystem.Enums.VehicleType;

public class VehicleInventoryManagement {

    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Vehicle> getVehiclesByVehicleType(VehicleType vehicleType) {
        // filter vehicles by vehicle type
        return vehicles;
    }
}
