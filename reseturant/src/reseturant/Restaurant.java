package reseturant;

import java.util.Arrays;

public class Restaurant {

	private String resetName;
	private Shift shift;
	private int workersCount = 0;
	private Workers[] workers;

	private Table[] tables;
	private int numOfTables = 0;
	private Menu menu;

	public Restaurant(String resetName) {
		this.resetName = resetName;

		createTable(16, 4);
		this.workers = new Workers[20];

		waiters();
		cookers();
		workers[workersCount++] = new ShiftManager(3000, "Avi");
		workers[workersCount++] = new Hostess(3000, "Gili");

		this.shift = new Shift("day shift", workers, getShiftManegar(), getHostess(), tables);

		this.setMenu(new Menu());
	}

	public int getNumOfTables() {
		return numOfTables;
	}

	private void createTable(int num, int numOfSeats) {
		for (int j = 0; j < tables.length; j++) {
			this.tables[j] = new Table(++numOfTables, numOfSeats);
		}
	}

	private Hostess getHostess() {
		for (int i = 0; i < workers.length; i++) {
			if (workers[i] instanceof Hostess && workers[i].isAvailable()) {
				workers[i].setAvailable(false);
				return (Hostess) workers[i];
			}
		}
		return null;
	}

	private ShiftManager getShiftManegar() {
		for (int i = 0; i < workers.length; i++) {
			if (workers[i] instanceof ShiftManager && workers[i].isAvailable()) {
				workers[i].setAvailable(false);
				return (ShiftManager) workers[i];
			}
		}
		return null;
	}

	private void waiters() {
		for (int i = 0; i < 7; i++) {
			workers[workersCount++ + i] = new Waiter(2500, "waiters " + i);
		}
	}

	private void cookers() {
		for (int i = 0; i < 7; i++) {
			workers[workersCount++ + i] = new Cooker(3000, "cooker " + i);
		}
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public String getResetName() {
		return resetName;
	}

	public void setResetName(String resetName) {
		this.resetName = resetName;
	}

	public Table[] getTables() {
		return tables;
	}

	public void setTables(Table[] tables) {
		this.tables = tables;

	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
