package reseturant;

public class Reservation {
	private Dish[] dishs;
	private int NumOfDishs=dishs.length;
	private double totalPrice = 0;

	
	public int getNumOfDishs(){
		return NumOfDishs;
	}

	public void setNumOfDishs(int numOfDishs) {
		NumOfDishs = numOfDishs;
	}

	public Dish[] getDishs() {
		return dishs;
	}

	public void setDishs(Dish[] dishs) {
		this.dishs = dishs;
	}
	
}
