
public class Main {

	public static Status worldStatus(Country[] country) {
		Status status = new Status();
		for (int i = 0; i < country.length; i++) {
			if (country[i].getDead() == 0) {
				status.setCount1(status.getCount1() + 1);
			} else {
				if (country[i].getDead() < country[i].getRecovered()) {
					status.setCount2(status.getCount2() + 1);
				}
				if (country[i].getRecovered() > country[i].getInfected() / 2) {
					status.setNames(status.getNames()+ " " +country[i].getName());
				}
			}

		}
		return status;
	}

	public static void main(String[] args) {
		Country[] allCountries = { new Country("Israel", 100000, 50000, 40000),
				new Country("Italy", 234545, 57634, 123), new Country("North korea", 0, 0, 0) };

		worldStatus(allCountries);
	}
}
