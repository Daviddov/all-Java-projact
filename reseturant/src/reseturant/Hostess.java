package reseturant;

import java.util.ArrayList;

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
	
	public Customer[] seatCustomers(Customer[] newCustomers, ArrayList<Table> tables) {
		//(need to build search for smallest table)
		int availableTables = 0;
		int alradySeats = 0;
		Customer[] seatCustomers = new Customer[newCustomers.length];
		
		for (int i = 0; i < tables.size(); i++) {
			if (tables.get(i).isAvailable()) {
				availableTables++;
			}
		}
		if (newCustomers.length  >= availableTables*4) {
			while(alradySeats != newCustomers.length) {
				Table table = findTableAvailable(tables);
				for (int i = 0; i < table.getSeatsNumber(); i++) {
					table.getSeatsCustomers()[i] = newCustomers[i + alradySeats];
					seatCustomers[i] = newCustomers[i + alradySeats++];
				}
				table.setAvailable(false);

			}
			
		}else {
			System.out.println("Sorry no place to seat");
		}
		return seatCustomers;
		
		
		
	}
}
