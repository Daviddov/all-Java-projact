package reseturant;

public class Employees extends Person {
private double salary;

public Employees(int salary,String name) {
	super(name);
	this.salary =salary;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
