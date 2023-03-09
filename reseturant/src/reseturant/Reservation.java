package reseturant;

public class Reservation {
	private Dish[] dishs;
	private int tableNum;
	private double totalPrice = 0;

public Reservation(int tableNum) {
	this.setTableNum(tableNum);
}


	public Dish[] getDishs() {
		return dishs;
	}

	public void setDishs(Dish[] dishs) {
		this.dishs = dishs;
	}


	public int getTableNum() {
		return tableNum;
	}


	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
