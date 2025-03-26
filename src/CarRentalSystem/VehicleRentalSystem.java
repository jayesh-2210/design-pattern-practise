package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {

    private List<User> users;
    private List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public Store findStoreByLocation(Location location) {
        for (Store store : stores) {
            if (store.getLocation().equals(location)) {
                return store;
            }
        }
        return null;
    }
}
