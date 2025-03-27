package CarRentalSystem;

import java.time.LocalDateTime;

import CarRentalSystem.Enums.ReservationStatus;

public class Reservation {

    private int reservationId;
    private Location location;
    private Vehicle vehicle;
    private LocalDateTime bookingDate;
    private LocalDateTime returnDate;
    private LocalDateTime bookingFrom;
    private Location pickUpLocation;
    private Location dropOffLocation;
    private User user;
    private ReservationStatus reservationStatus;

    public Reservation(int reservationId, Location location, Vehicle vehicle, LocalDateTime bookingDate, LocalDateTime returnDate, LocalDateTime bookingFrom, Location pickUpLocation, Location dropOffLocation, User user, ReservationStatus reservationStatus) {
        this.reservationId = reservationId;
        this.location = location;
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.returnDate = returnDate;
        this.bookingFrom = bookingFrom;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.user = user;
        this.reservationStatus = reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
    // getters and setters for all fields

    // Other methods for reservation status updates and calculations
    // Example: calculateTotalRentalCost()
    // Example: updateReservationStatus()
    // Example: cancelReservation()



}
