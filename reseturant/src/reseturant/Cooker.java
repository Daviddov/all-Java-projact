package reseturant;

public class Cooker extends Workers{

	public Cooker(int salary, String name) {
		super(salary, name);
		
	}


	public void makeDish(Dish dish) {
		dish.setRady(true);
	}
	
	public void makeTheBon(Reservation bon) {
		Dish[] dishResavtion = bon.getDishs();
		for (int i=0; i < dishResavtion.length ;i++) {
			if(!dishResavtion[i].isDone()) {
				dishResavtion[i].setRady(true);
			}
		}
	}
}
