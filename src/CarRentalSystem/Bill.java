package CarRentalSystem;

public class Bill {

    private Reservation reservation;
    private double totalCost;
    private boolean isPaid;

    public Bill(Reservation reservation, double totalCost, boolean isPaid) {
        this.reservation = reservation;
        this.totalCost = totalCost;
        this.isPaid = isPaid;
    }


    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
