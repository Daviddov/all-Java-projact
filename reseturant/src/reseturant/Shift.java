package reseturant;

public class Shift {

private String name;
private Tables tables;
private Waiter waiter;
private ShiftManager shiftManager;
private Customers[] customers;

public Shift(String Shift) {
	this.name = Shift;
	 this.tables =new Tables();
	 this.waiter = new Waiter(2500, "Moshe");
	 this.shiftManager = new ShiftManager(3000, "Avi");
	 
	 
}
}
