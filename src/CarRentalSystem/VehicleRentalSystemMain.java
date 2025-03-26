package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

import CarRentalSystem.Enums.VehicleStatus;
import CarRentalSystem.Enums.VehicleType;

public class VehicleRentalSystemMain {

    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(users, stores);

        Store store = vehicleRentalSystem.findStoreByLocation(new Location("123 Main St", "New York", "NY", "10001"));
        List<Vehicle> relatedVehicles = store.getVehicleBasedOnVehicleType(VehicleType.CAR);
        Reservation reservation = store.createReservation(relatedVehicles.get(0), users.get(0), new Location("456 Elm St", "Los Angeles", "CA", "90001"));
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Jayesh", "DL123456");
        User user2 = new User(2, "Sarah", "DL789012");
        User user3 = new User(3, "Tom", "DL345678");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle(1, "RJ17SW2525", VehicleStatus.ACTIVE, VehicleType.CAR, 5,5,5,5);
        Vehicle vehicle2 = new Vehicle(2, "RJ19SW2525", VehicleStatus.ACTIVE, VehicleType.CAR, 5,5,5,5);
        Vehicle vehicle3 = new Vehicle(3, "RJ16SW2525", VehicleStatus.ACTIVE, VehicleType.CAR, 5,5,5,5);
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        return vehicles;
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Location location1 = new Location("123 Main St", "New York", "NY", "10001");
        Store store1 = new Store(1, location1, new VehicleInventoryManagement(vehicles));
        stores.add(store1);
        return stores;
    }

}
