package reseturant;

public class Table {

	private int tableNumber;
	private int seatNumber = 4;
	private Customer[] seatsCustomers = new Customer[seatNumber]; 
	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public void setReservations(Reservation[] reservations) {
		this.reservations = reservations;
	}

	private boolean available;
	private Reservation[] reservations;
	private double reservationTotalPrice = 0;
	
	public Table(int tableNumber) {
		setTableNumber(tableNumber);
		this.available = true;
		
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Reservation[] getReservations() {
		return reservations;
	}
	public void setReservations(Dish[] dishs) {
		this.reservations = reservations;
	}

	public double getReservationTotalPrice() {
		return reservationTotalPrice;
	}

	public void setReservationTotalPrice(double reservationTotalPrice) {
		this.reservationTotalPrice = reservationTotalPrice;
	}

	public Customer[] getSeatsCustomers() {
		return seatsCustomers;
	}

	public void setSeatsCustomers(Customer[] seatsCustomers) {
		this.seatsCustomers = seatsCustomers;
	}

}
