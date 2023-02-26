package reseturant;

public class Restaurant {
	
private String resetName;
private Shift shift;
public Restaurant(String resetName) {
	this.resetName = resetName;
	 this.shift = new Shift("day shift");
}

}
