package reseturant;

import java.util.LinkedList;

public class Menu {
	
	private LinkedList<Dish> dishs = new LinkedList<Dish>();

	public LinkedList<Dish> getDishs() {
		return dishs;
	}
	
	public Dish[] getDishsToArray() {
		return (Dish[]) dishs.toArray();
	}

	public void setDishs(LinkedList<Dish> dishs) {
		this.dishs = dishs;
	}
	
	public void addDish(Dish dish){
		dishs.add(dish);
	}
	
}
