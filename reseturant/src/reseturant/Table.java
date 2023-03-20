package reseturant;

public class Table {

	private int tableNumber;
	private int seatsNumber;
	private Waiter waiter;

	private boolean didReservation = false;
	private boolean available;
	private Customer[] seatsCustomers; 
	private Reservation reservation;
	
	
	public Table(int tableNumber, int numOfSeats) {
		this.tableNumber = tableNumber;
		this.available = true;
		this.seatsNumber = numOfSeats;
		this.seatsCustomers = new Customer[seatsNumber]; 
		this.reservation = new Reservation(tableNumber);
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
	
	public void cleanTable() {
		this.available = true;
		this.didReservation = false;
		this.seatsCustomers = null;
		this.reservation = new Reservation(this.tableNumber);

	}

}
