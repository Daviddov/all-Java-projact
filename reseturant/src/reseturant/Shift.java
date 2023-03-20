package reseturant;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class Shift {

	private String name;
	private ArrayList<Workers> shiftWorkers = new ArrayList<Workers>();

	private Customer[] customers;
	private final int MAX_CUSTOMERS = 100;
	private final int MAX_CUSTOMERS_SEATS = 50;
	private LinkedList<Customer> seatingCustomers = new LinkedList<Customer>();
	private int customersCount = 0;
	private ShiftManager shfitManeger;
	private int waitersNum = 4;
	private int cookersNum = 3;
	private Hostess hostess;
	private ArrayList<Table> tables = new ArrayList<Table>();
	private Queue<Reservation> allReservations = new ArrayDeque<>();
	private Cooker chaf;
	private double shiftCash = 0;

	public Shift(String Shift, ArrayList<Workers> workers, ShiftManager shiftManager, Hostess hostess,
			ArrayList<Table> tables, Menu menu) {
		this.setName(Shift);
		this.shfitManeger = shiftManager;
		this.hostess = hostess;
		this.tables = tables;

//1
		shfitManeger.assignWorkersShift(workers, shiftWorkers, cookersNum, waitersNum, tables);
		// 2
		shiftManager.assignTablesWaiters(shiftWorkers);
////3
//		customers = new Customer[MAX_CUSTOMERS];
//		// 4
//		seatCustomer(4);
//		// 5 add resavetion
//
//		for (int i = 0; i < tables.size(); i++) {
//			if (!tables.get(i).isAvailable() && !tables.get(i).isDidReservation()) {
//				int numOfDish = 2;
//				Dish[] dishesReservation = new Dish[numOfDish];
//				dishesReservation[0] = menu.getDishsToArray()[0];
//				dishesReservation[1] = menu.getDishsToArray()[1];
//
//				tables.get(i).getWaiter().takeReservation(tables.get(i), dishesReservation);
//				allReservations.add(tables.get(i).getReservation());
//			}
//		}
//		// set chaf
//		for (int i = 0; i < shiftWorkers.size(); i++) {
//			if (shiftWorkers.get(i) instanceof Cooker) {
//				chaf = (Cooker) shiftWorkers.get(i);
//				break;
//			}
//		}
//
//		// 6 cook bon
//		chaf.makeTheBon(allReservations.peek());
//
//		// 7 wiater take the dishs to the customer
//		int tableNum = allReservations.peek().getTableNum();
//		for (int i = 0; i < tables.size(); i++) {
//			if (tableNum == tables.get(i).getTableNumber()) {
//				tables.get(i).getWaiter().serveDishs(allReservations.remove());
//				break;
//			}
//		}
//		// 8 end diner --> pay and live
//		endOfMeal(tables.get(0).getTableNumber());

	}

	private void endOfMeal(int tableNum) {
		for (int i = 0; i < tables.size(); i++) {
			if (tableNum == tables.get(i).getTableNumber()) {
				this.shiftCash += tables.get(i).getReservation().getTotalPrice();
				tables.get(i).cleanTable();
				break;
			}
		}
	}

	private void seatCustomer(int newCustomers) {
		Customer[] newSeatCustomers;
		newSeatCustomers = new Customer[newCustomers];
		newSeatCustomers = hostess.seatCustomers(customers(newCustomers), tables);
//update all seat customers
		addSeatingCustomers(newSeatCustomers);

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

	public LinkedList<Customer> getSeatingCustomer() {
		return seatingCustomers;
	}

	public void setSeatingCustomer(LinkedList<Customer> seatingCustomer) {
		this.seatingCustomers = seatingCustomer;
	}

	public void addSeatingCustomers(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			seatingCustomers.add(customers[i]);
		}
	}

	public void addSeatingCustomer(Customer customer) {
		seatingCustomers.add(customer);
	}

	public int getMAX_CUSTOMERS_SEATS() {
		return MAX_CUSTOMERS_SEATS;
	}

	public double getShiftCash() {
		return shiftCash;
	}

	public void setShiftCash(double restaurantCash) {
		this.shiftCash = restaurantCash;
	}

}
