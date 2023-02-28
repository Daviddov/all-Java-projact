package reseturant;

import java.security.PublicKey;

public class ShiftManager extends ManagerialPerson {
private Table[] tables;
private Workers[] shfitWorkers;

	public ShiftManager(int salary, String name) {
		super(salary, name);

	}

	public void assignWorkersShift(Workers[] allWorkers, Workers[] shfitWorkers, int cookers, int waiters, Table[] tables) {
		int index = 0;
		this.tables = tables;
		this.shfitWorkers = shfitWorkers;
		for (int i = 0; i < cookers; i++) {
			for (int j = 0; j < allWorkers.length; j++) {
				if (allWorkers[j].isAvailable() && allWorkers[j] instanceof Cooker) {
					shfitWorkers[index++] = allWorkers[j];
					allWorkers[j].setAvailable(false);
				}
			}
			for (int j = 0; j < waiters; j++) {
				if (allWorkers[j].isAvailable() && allWorkers[j] instanceof Waiter) {
					shfitWorkers[index++] = allWorkers[j];
					allWorkers[j].setAvailable(false);
				}
			}
		}
		
	}
	
	public void assignTablesWaiters(Workers[] shiftWorkers) {
		int numberOfTables = tables.length;
		int tablesAssigned = 0;	

		for (int i = 0; i < shiftWorkers.length; i++) {
			if (shiftWorkers[i] instanceof Waiter) {
				Waiter waiter = (Waiter) shiftWorkers[i];
				if (tablesAssigned == numberOfTables) {
					return;
				}
				TablesForWaiter(waiter, 4);
				}
				
			}
		}
	

	public void TablesForWaiter (Waiter waiter, int TablesForWaiter) {
		for (int k = 0; k < TablesForWaiter; k++) {
					for (int j = 0; j < TablesForWaiter; j++) {
					if (tables[j].getWaiter() == null) {
						assignWaitersToTable(waiter, tables[j]);
						break;
					}
				}
	}
	}
	
	
	public void assignWaitersToTable(Waiter waiter,Table table) {
		table.setWaiter(waiter);
	}
}
