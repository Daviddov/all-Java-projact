package reseturant;

public class Waiter extends Workers{

	public Waiter(int salary, String name) {
		super(salary, name);
		
	}

	public void takeReservation(Table table, Dish[] newDishes) {
	    Reservation reservation = table.getReservation();
	    Dish[] oldDishes = reservation.getDishs();

	    Dish[] allDishes = new Dish[0];
	    
	    // Copy old dishes to new array
	    allDishes = addToDishs(allDishes ,oldDishes);
	    
	    // Copy new dishes to new array
	    allDishes = addToDishs(allDishes ,newDishes);
	    
	    // Update the reservation with the new array of dishes
	  
	    reservation.setDishs(allDishes);
	}
	
private Dish[] addToDishs(Dish[] oldDishs, Dish[] newDishs) {
	Dish[] allDishs= new Dish[oldDishs.length + newDishs.length];
	int numOldDishesCopied=0;

	for (int i = 0; i < oldDishs.length; i++) {
		allDishs[i] = oldDishs[i];
		numOldDishesCopied++;
}

for (int i = 0; i < newDishs.length ; i++) {
	allDishs[i + numOldDishesCopied] = newDishs[i];
}

	
	return allDishs;
}

}
