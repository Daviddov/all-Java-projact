import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String drawDies= 
"  .-------.    ______\n"+
" /   o   /|   /\\     \\ \n"+
"/_______/o|  /o \\  o  \\ \n"+
"| o     | | /   o\\_____\\ \n"+
"|   o   |o/ \\o   /o    / \n"+
"|     o |/   \\ o/  o  / \n"+
 " -------      \\/____o/ \n";
 
 	

System.out.println(drawDies);
Dies diseDies = new Dies(2);

for (int i = 0; i < diseDies.getDies().length; i++) {
	int faceVal = diseDies.getDies()[i].roll();
	System.out.println(faceVal);
    System.out.println();
    System.out.println();
    
}


	}

}
