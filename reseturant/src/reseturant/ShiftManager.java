package reseturant;

import java.security.PublicKey;
import java.util.ArrayList;

public class ShiftManager extends ManagerialPerson {
	private ArrayList<Table> tables = new ArrayList<Table>();
	private ArrayList<Workers> shfitWorkers;
	private int tablesForWaiter = 4;

	public ShiftManager(int salary, String name) {
		super(salary, name);

	}

	public void assignWorkersShift(ArrayList<Workers> workers, ArrayList<Workers> shiftWorkers, int cookers,
			int waiters, ArrayList<Table> tables) {
		this.tables = tables;
		this.setShfitWorkers(shiftWorkers);

		// add cookers to the shift
		for (int i = 0; i < cookers; i++) {
			for (int j = 0; j < workers.size(); j++) {
				if (workers.get(j).isAvailable() && workers.get(j) instanceof Cooker) {
					shiftWorkers.add(workers.get(j));
					workers.get(j).setAvailable(false);
					System.out.println("set cooker");
				}
			}
			// add waiters to the shift
			for (int j = 0; j < workers.size(); j++) {
				if (workers.get(j).isAvailable() && workers.get(j) instanceof Waiter) {
					shiftWorkers.add(workers.get(j));
					workers.get(j).setAvailable(false);
					System.out.println("set waiter");

				}
			}
		}

	}

	public void assignTablesWaiters(ArrayList<Workers> shiftWorkers) {
		int numberOfTables = tables.size();
		int tablesAssigned = 0;

		for (int i = 0; i < shiftWorkers.size(); i++) {
			if (tablesAssigned == numberOfTables) {
				return;
			}
			if (shiftWorkers.get(i) instanceof Waiter) {
				Waiter waiter = (Waiter) shiftWorkers.get(i);
				TablesForWaiter(waiter, tablesForWaiter);
			}

		}
	}

	public void TablesForWaiter(Waiter waiter, int TablesForWaiter) {
		for (int k = 0; k < TablesForWaiter; k++) {
			for (int j = 0; j < tables.size(); j++) {
				if (!isWaiterToTable(tables.get(j))) {
					assignWaitersToTable(waiter, tables.get(j));
					System.out.println("assign waiter " + waiter.getName() + " to table " + tables.get(j).getTableNumber());
					break;
				}
			}
		}
	}

	private boolean isWaiterToTable(Table table) {
		if (table.getWaiter() == null) {
			return false;
		}
		return true;
	}

	public void assignWaitersToTable(Waiter waiter, Table table) {
		table.setWaiter(waiter);
	}

	public ArrayList<Workers> getShfitWorkers() {
		return shfitWorkers;
	}

	public void setShfitWorkers(ArrayList<Workers> shiftWorkers) {
		this.shfitWorkers = shiftWorkers;
	}

}
