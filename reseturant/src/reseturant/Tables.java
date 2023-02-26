package reseturant;

public class Tables {
	private Table[][] tables;
	private int numOfTables = 0;

	public Tables() {
		this.tables = new Table[4][4];
		for (int i = 0; i < this.tables.length; i++) {
			for (int j = 0; j < tables[i].length; j++) {
				this.tables[i][j] = new Table(++numOfTables);
			}
		}
		drawTable();
	}

	public void drawTable() {
		for (int i = 0; i < tables.length; i++) {
			Table[] rewTables = tables[i];
			for (int j = 0; j < rewTables.length; j++) {
				System.out.print("+-----+   ");

			}
			System.out.println();

			for (int j = 0; j < rewTables.length; j++) {
				System.out.print("| " + (rewTables[j].getTableNumber() + 10) + "  |   ");

			}
			System.out.println();

			for (int j = 0; j < rewTables.length; j++) {
				System.out.print("+-----+   ");

			}
			System.out.println();

			for (int j = 0; j < rewTables.length; j++) {
				if (rewTables[j].isAvailable()) {
					System.out.print(" EMPTY    ");
				} else {
					System.out.print("unavailable");

				}

			}
			System.out.println();
		}
	}

}
