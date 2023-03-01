package reseturant;

public class Shift {

	private String name;
	private Workers[] shiftWorkers;
	private Customer[] customers;
	private final int MAX_CUSTOMERS = 100;
	private final int MAX_CUSTOMERS_SEATS = 50;
	private Customer[] allSeatCustomers = new Customer[0];
	private int customersCount = 0;
	private ShiftManager shfitManeger;
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
		
		customers = new Customer[MAX_CUSTOMERS];
		this.allSeatCustomers = seatCustomer(4);
		
		for (int i = 0; i < tables.length; i++) {
			if (!tables[i].isAvailable() && !tables[i].isDidReservation() ) {
				int numOfDish =2;
				Dish[] dishes = new Dish[numOfDish];
				dishes[0] =new Dish("Pizza", 50);
				dishes[1] =new Dish("Pizza", 50);
				tables[i].getWaiter().takeReservation(tables[i],dishes);
			}
			
		}
	}

	private Customer[] seatCustomer(int newCustomers) {
		Customer[] newSeatCustomers;
		newSeatCustomers = new Customer[newCustomers];
		newSeatCustomers = hostess.seatCustomers(customers(newCustomers), tables);
//update all seat customers
		return addSeatCustomers(newSeatCustomers);
	}

	private Customer[] addSeatCustomers(Customer[] newSeatCustomers) {
		int newCusromers = newSeatCustomers.length;
		int alradySeat = this.allSeatCustomers.length;
		Customer[] newAllSeatCustomers = new Customer[alradySeat + newCusromers];

		int countSeatCustomer = 0;
		for (int i = 0; i < alradySeat; i++) {
			newAllSeatCustomers[i] = this.allSeatCustomers[i];
			countSeatCustomer++;
		}
		for (int j = 0; j < alradySeat; j++) {
			newAllSeatCustomers[j + countSeatCustomer] = newSeatCustomers[j];
		}
		return newAllSeatCustomers;

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
