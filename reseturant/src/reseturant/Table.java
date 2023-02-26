package reseturant;

public class Table {

	private int tableNumber;
	private Seat[] seats;
	private int seatNumber = 2;
	private boolean available;

	public Table(int numOfTable) {
		setTableNumber(numOfTable);
		this.available = true;
		seats = new Seat[seatNumber];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new Seat();
		}
	}

	public boolean isAvailable() {
		for (int i = 0; i < seats.length; i++) {
			if (!seats[i].isEmptySeat()) {
				this.available = false;
			}
		}
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

}
