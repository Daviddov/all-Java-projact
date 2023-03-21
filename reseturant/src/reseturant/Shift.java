package reseturant;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Shift {

	private String name;
	private ArrayList<Workers> shiftWorkers = new ArrayList<Workers>();

	private Customer[] customers;
	private final int MAX_CUSTOMERS = 100;
	private final int MAX_CUSTOMERS_sitS = 50;
	private ArrayList<Customer> sitingCustomers = new ArrayList<Customer>();
	private int customersCount = 0;
	private ShiftManager shfitManeger;
	private int waitersNum = 4;
	private int cookersNum = 3;
	private Hostess hostess;
	private ArrayList<Table> tables = new ArrayList<Table>();
	private Queue<Reservation> allReservations = new ArrayDeque<>();
	private Cooker chaf;
	private double shiftCash = 0;
	private Menu menu;
	private ArrayList<Dish> newResavtion = new ArrayList<Dish>();
	
	public Shift(String Shift, ArrayList<Workers> workers, ShiftManager shiftManager, Hostess hostess,
			ArrayList<Table> tables, Menu menu) {
		this.setName(Shift);
		this.shfitManeger = shiftManager;
		this.hostess = hostess;
		this.tables = tables;
		this.chaf = setChaf();
		this.menu = menu;
//1 Auto
		shfitManeger.assignWorkersShift(workers, shiftWorkers, cookersNum, waitersNum, tables);
		// 2 Auto
		shiftManager.assignTablesWaiters(shiftWorkers);
////3 Auto
		customers = new Customer[MAX_CUSTOMERS];
//		// 4
//		sitCustomer(4);
//		// 5 make resavetion
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
		menu();
	}

	public void menu() {
		System.out.println(" 1. hostes \n 2. shift manager \n 3. waiter \n 4. cooker \n 5. costumer");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		handleChois(input);

	}

	private void handleChois(int input) {
		switch (input) {
		case 1: {
			hostessMenu();
			break;
		}
		case 2: {
			shfitManegerMenu();
			break;
		}
		case 3: {
			waiterMenu();
			break;
		}
		case 4: {
//		cookerMenu();
			break;
		}

		default:
			menu();
		}
	}

	private void hostessMenu() {
		System.out.println(" 1. new costumers \n 2. exit");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		handleHostessChois(input);
	}

	private void handleHostessChois(int input) {
		Scanner in = new Scanner(System.in);
		switch (input) {
		case 1: {
			System.out.println(" How many customers came?");
			int input2 = in.nextInt();
			sitCustomer(input2);
			hostessMenu();
			break;
		}

		case 2: {
			menu();
			break;
		}

		default:
			hostessMenu();
		}
	}

	private void shfitManegerMenu() {
		System.out.println(" 1. assign wiater to table  \n 2.exit");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		handleShfitManegerChois(input);
	}

	private void handleShfitManegerChois(int input) {
		Scanner in = new Scanner(System.in);
		switch (input) {
		case 1: {
//			shfitManeger.waiterToTableByName();
			shfitManegerMenu();
			break;
		}
		case 2: {
			menu();
			break;
		}
		default:
			shfitManegerMenu();
		}
	}

	private void waiterMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println(" 1. make resavetion \n 2.end diner \n 3. exit");
		int input = in.nextInt();
			handleWaiterChois(input);	
	}

	private void handleWaiterChois(int input) {
		Scanner in = new Scanner(System.in);
		switch (input) {
		case 1: {
			int tableNum = selectTable();
			showMenu(menu);
			makeRasvation(tableNum);
			waiterMenu();
			break;
		}
		case 2: {
			int tableNum = selectTable();
			waiterMenu();
			break;
		}
		case 3: {
			menu();
			break;
		}
		default:
			waiterMenu();
		}
	}
	private int selectTable() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < tables.size(); i++) {
			System.out.println(i+". "+ tables.get(i).getTableNumber());
		}
		System.out.println("choose table number");
		return in.nextInt();
	}
	private void showMenu(Menu menu) {
		ArrayList<Dish> menuDishs = menu.getDishs();
		for (int i = 0; i < menuDishs.size(); i++) {
			System.out.println(i + "." + menuDishs.get(i).getName());
		}
	}

	private void makeRasvation(int tableNum) {
		
		addDishToResavtion(newResavtion);
		Waiter tableWaiter = tables.get(tableNum).getWaiter();
		tableWaiter.takeReservation(tables.get(tableNum), newResavtion);
		allReservations.add(tables.get(tableNum).getReservation());
	}

	private void addDishToResavtion(ArrayList<Dish> newResavtion) {
		System.out.println("choose a dish");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		newResavtion.add((Dish) menu.getDishs().toArray()[input]);
		
		System.out.println("Do you want another one \n 1. Yes \n 2. No");
		input = in.nextInt();
		if(input == 1) {
			addDishToResavtion(newResavtion);
		} 
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

	private void sitCustomer(int newCustomers) {
		Customer[] newsitCustomers;
		newsitCustomers = new Customer[newCustomers];
		newsitCustomers = hostess.sitCustomers(customers(newCustomers), tables);
//update all sit customers
		addSitingCustomers(newsitCustomers);

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

	private Cooker setChaf() {
		for (int i = 0; i < shiftWorkers.size(); i++) {
			if (shiftWorkers.get(i) instanceof Cooker) {
				return (Cooker) shiftWorkers.get(i);
			}
		}
		return null;
	}

	public ArrayList<Customer> getsitingCustomer() {
		return sitingCustomers;
	}

	public void setSitingCustomer(ArrayList<Customer> sitingCustomer) {
		this.sitingCustomers = sitingCustomer;
	}

	public void addSitingCustomers(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			sitingCustomers.add(customers[i]);
		}
	}

	public void addSitingCustomer(Customer customer) {
		sitingCustomers.add(customer);
	}

	public int getMAX_CUSTOMERS_sitS() {
		return MAX_CUSTOMERS_sitS;
	}

	public double getShiftCash() {
		return shiftCash;
	}

	public void setShiftCash(double restaurantCash) {
		this.shiftCash = restaurantCash;
	}

}
