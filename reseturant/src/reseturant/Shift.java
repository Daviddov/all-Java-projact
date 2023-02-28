package reseturant;

public class Shift {

	private String name;
	private Workers[] shiftWorkers;
	private Customer[] customers;
	private int customersCount = 0;
	private ShiftManager shfitManeger;
	private final int MAX_CUSTOMERS = 50;
	private int waitersNum = 4;
	private int cookersNum = 3;
	private Hostess hostess;
	private Table[] tables;

	public Shift(String Shift, Workers[] allWorkers, ShiftManager shiftManager, Hostess hostess, Table[] tables) {
		this.setName(Shift);
		this.shfitManeger = shiftManager;
		this.hostess = hostess;
		this.tables = tables;
		shfitManeger.assignWorkersShift(allWorkers, shiftWorkers, cookersNum, waitersNum, tables);
		shiftManager.assignTablesWaiters(shiftWorkers);
		//---
		customers = new Customer[MAX_CUSTOMERS];
		hostess.seatCustomers(customers(4), tables);
	}

	
	public Customer[] customers(int num) {
		Customer[] newCustomer = new Customer[num];
		Customer customer;
		for (int i = 0; i < num; i++) {
			customer = new Customer("guest " + customersCount + 1);
			newCustomer[i] = customer;
			customers[i + customersCount++] = newCustomer[i];
		}
		return newCustomer;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
