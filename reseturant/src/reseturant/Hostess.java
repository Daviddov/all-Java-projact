package reseturant;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Scanner;

public class Hostess extends Workers {

	public Hostess(int salary, String name) {
		super(salary, name);

	}

	private Table findTableAvailable(ArrayList<Table> tables) {
		for (int i = 0; i < tables.size(); i++) {
			Table table = tables.get(i);
			if (table.isAvailable()) {
				return table;
			}
		}
		return null;
	}


	public Customer[] sitCustomers(Customer[] newCustomers, ArrayList<Table> tables) {
		// (need to build search for smallest table)
		int availableTables = 0;
		int alradySeats = 0;
		Customer[] seatCustomers = new Customer[newCustomers.length];

//		count available Tables
		for (int i = 0; i < tables.size(); i++) {
			if (tables.get(i).isAvailable()) {
				availableTables++;
			}
		}
		
		if (newCustomers.length <= availableTables * 4) {
			while (alradySeats != newCustomers.length) {
				Table table = findTableAvailable(tables);
				
				for (int j = 0; j < table.getSitsNumber(); j++) {
					if(alradySeats == newCustomers.length){
						return seatCustomers;
					}
//					seatCustomers costumer in seat
					table.getSitsCustomers()[j] = newCustomers[alradySeats];
//					inset the costumers they alrady Seats to new array
					seatCustomers[j] = newCustomers[alradySeats++];
					System.out.println("costomer seat!");
				}
				table.setAvailable(false);
			

			

			}
		} else {
			System.out.println("Sorry no place to seat");
		}
		return seatCustomers;

	}
}
