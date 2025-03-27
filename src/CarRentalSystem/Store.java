package CarRentalSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import CarRentalSystem.Enums.ReservationStatus;
import CarRentalSystem.Enums.VehicleType;

public class Store {

    private int storeId;
    private Location location;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private List<Reservation> reservations;

    public Store(int storeId, Location location, VehicleInventoryManagement vehicleInventoryManagement) {
        this.storeId = storeId;
        this.location = location;
        this.vehicleInventoryManagement = vehicleInventoryManagement;
        this.reservations = new ArrayList<>();
    }

    public int getStoreId() {
        return storeId;
    }

    public Location getLocation() {
        return location;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Vehicle> getVehicleBasedOnVehicleType(VehicleType vehicleType) {
        return vehicleInventoryManagement.getVehiclesByVehicleType(vehicleType);
    }

    public Reservation createReservation(Vehicle vehicle, User user, Location location) {
        // Check if the vehicle is available during the specified dates
        Reservation reservation = new Reservation(
            1, location, vehicle, LocalDateTime.now(), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusHours(1),
           location,location, user, ReservationStatus.SCHEDULED);
        reservations.add(reservation);
        return reservation;
    }

    public void completeTripOrProcess(Reservation reservation, Bill bill) {
        // Update the reservation status and calculate the total cost
        reservation.setReservationStatus(ReservationStatus.COMPLETED);
        // Calculate the total cost based on the booking duration and rates
        bill.setPaid(true);
        // Add the bill to the user's account
    }
}

