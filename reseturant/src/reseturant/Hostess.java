package reseturant;

public class Hostess extends Workers {

	public Hostess(int salary, String name) {
		super(salary, name);

	}
private Table findTable() {
	for (int i = 0; i < tables.getTables().length; i++) {
		for (int j = 0; j < tables.getTables()[i].length; j++) {
			Table table = tables.getTables()[i][j];
			if (table.isAvailable()) {
				return table;

			}
		}
	}
}
	
	public void seatCustomers(Customer[] newCustomers, Tables tables) {
//		int customersSeats = 0;
		
		if (newCustomers.length >= tables.availableTables()) {
			findTable();
		}
		
		
		
		
	}
}
