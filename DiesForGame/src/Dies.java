
public class Dies {
private Die[] dies;


public Dies(int num) {	
	this.dies = new Die[num];
	for (int i = 0; i < dies.length; i++) {
		dies[i] = new Die();
	}
}

public Die[] getDies() {
	return dies;
}

public void setDies(Die[] dies) {
	this.dies = dies;
}


}
