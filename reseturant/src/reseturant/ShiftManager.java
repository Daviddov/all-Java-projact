package reseturant;

public class ShiftManager extends ManagerialPerson {

	public ShiftManager(int salary, String name) {
		super(salary, name);

	}

	public void assignWorkersshift(Workers[] allWorkers, Workers[] shfitWorkers, int cookers, int waiters) {
		int index = 0;

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
}
