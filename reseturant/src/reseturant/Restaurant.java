package reseturant;

import java.util.Arrays;

public class Restaurant {

	private String resetName;
	private Shift shift;
	private int workersCount=0;
	private Workers[] workers;
	private Tables tables;
	private Menu menu;
	
	public Restaurant(String resetName) {
		this.resetName = resetName;
		this.tables = new Tables(4,4);
		this.workers = new Workers[20];
		
		waiters();
		cookers();
		workers[workersCount++] = new ShiftManager(3000, "Avi");
		workers[workersCount++] = new Hostess(3000, "Gili");
		
		this.shift = new Shift("day shift", workers, getShiftManegar(), getHostess(), tables);
		
		this.setMenu(new Menu());
	}

	
	private Hostess getHostess() {
		for (int i = 0; i < workers.length; i++) {
			if(workers[i] instanceof Hostess && workers[i].isAvailable()) {
				workers[i].setAvailable(false);
				return (Hostess) workers[i];
			}
		}
		return null;
	}
	
	private ShiftManager getShiftManegar() {
		for (int i = 0; i < workers.length; i++) {
			if(workers[i] instanceof ShiftManager && workers[i].isAvailable()) {
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

	public Tables getTables() {
		return tables;
	}

	public void setTables(Tables tables) {
		this.tables = tables;

}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
