package reseturant;

public class Table {

	private int tableNumber;
	private int seatsNumber;
	private boolean didReservation = false;
	private Customer[] seatsCustomers; 
	private Waiter waiter;

	private boolean available;
	private Reservation reservation;
	
	
	public Table(int numOfSeats) {
		
	}
	public int getSeatsNumber() {
		return seatsNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatsNumber = seatNumber;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public Table(int tableNumber, int numOfSeats) {
		this.available = true;
		this.seatsNumber = numOfSeats;
		this.seatsCustomers = new Customer[seatsNumber]; 
		
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

	public Reservation getReservation() {
		return reservation;
	}
	
	public void setReservations(Dish[] dishs) {
		this.reservation = reservation;
	}

	public Customer[] getSeatsCustomers() {
		return seatsCustomers;
	}

	public void setSeatsCustomers(Customer[] seatsCustomers) {
		this.seatsCustomers = seatsCustomers;
	}
	public Waiter getWaiter() {
		return waiter;
	}
	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}
	
	public boolean isDidReservation() {
		return didReservation;
	}
	public void setDidReservation(boolean didReservation) {
		this.didReservation = didReservation;
	}

}
