package reseturant;

public class Customer extends Person{
	private Dish[] dishs;
	
	public Customer(String name) {
		super(name);
		
	}
	
	public Dish[] getDishs() {
		return dishs;
	}
	public void setDishs(Dish[] dishs) {
		this.dishs = dishs;
	}

}
