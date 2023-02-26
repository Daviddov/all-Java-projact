import java.util.Random;

public class AnimatedDie {
	
//    public static void main(String[] args) {
     private Random rand = new Random();

        // Define the die faces as strings
     String[] cube = {
     		"  .-------. \n"+
   			 " /       /| \n"+
   			 "/_______/ | \n"+
   			 "|       | | \n"+
   			 "|   o   | / \n"+
   			 "|       |/  \n"+
   			 " -------    \n",
         	 	
             	"           _______  \n"+
             	"	  /O     /\\  \n"+
             	"	 /   O  /O \\ \n"+
             	"	/_____O/    \\  \n"+
             	"	\\O    O\\    /  \n"+
             	"	 \\O    O\\ O/  \n"+
             	"	  \\O____O\\/ \n"+
             	"\n"+
             	"\n"+
             	"\n",
                 "              	   .-------. \n"+
    			 "	 	  /       /| \n"+
    			 "		 /_______/ | \n"+
    			 "		 | o     | | \n"+
    			 "		 |       | / \n"+
    			 "		 |     o |/  \n"+
    			 "		  -------    \n",
    			 		 "	    ______\n"+
    					 " 	   /\\     \\ \n"+
    					 "	  /o \\  o  \\ \n"+
    					 "	 /   o\\_____\\ \n"+
    					 "	 \\o   /o    / \n"+
    					 "	  \\ o/  o  / \n"+
    					 " 	   \\/____o/ \n"+
    		             	"\n"+
    		             	"\n"+
    		             	"\n",
                     		"  .-------. \n"+
                   			 " /   o   /| \n"+
                   			 "/_______/o| \n"+
                   			 "| o     | | \n"+
                   			 "|   o   |o/ \n"+
                   			 "|     o |/  \n"+
                   			 " -------    \n",

                          "	    ______\n"+
                			 " 	   /\\     \\ \n"+
                			 "	  /o \\  o  \\ \n"+
                			 "	 /   o\\_____\\ \n"+
                			 "	 \\o   /o    / \n"+
                			 "	  \\ o/  o  / \n"+
                			 " 	   \\/____o/ \n"+
                          	"\n"+
                          	"\n"+
                         	"\n",
                	      
                  		"	  .-------. \n"+
                			 "	 /   o   /| \n"+
                			 "	/_______/o| \n"+
                			 "	| o   o | | \n"+
                			 "	|   o   |o/ \n"+
                			 "	| o   o |/  \n"+
                			 "	 -------    \n",
                     
      			 
                        	 	
                        	" 		   _______  \n"+
                        	"		  /O     /\\  \n"+
                        	"		 /   O  /O \\ \n"+
                        	"		/_____O/    \\  \n"+
                        	"		\\O    O\\    /  \n"+
                        	"		 \\O    O\\ O/  \n"+
                        	" 		  \\O____O\\/ \n"+
                         	"\n"+
                         	"\n",
                        	
                  		"	  .-------. \n"+
                			 "	 /       /| \n"+
                			 "	/_______/ | \n"+
                			 "	| o   o | | \n"+
                			 "	| o   o | / \n"+
                			 "	| o   o |/  \n"+
                			 "	 -------    \n",
                 };
     String[] die = {
      		"  .-------. \n"+
      	   			 " /       /| \n"+
      	   			 "/_______/ | \n"+
      	   			 "|       | | \n"+
      	   			 "|   o   | / \n"+
      	   			 "|       |/  \n"+
      	   			 " -------    \n",
      	              "    	   .-------. \n"+
      	       			 " 	  /   o   /| \n"+
      	       			 "	 /_______/ | \n"+
      	       			 "	 | o     | | \n"+
      	       			 "	 |       | / \n"+
      	       			 "	 |     o |/  \n"+
      	       			 "	  -------    \n",

                  		"  .-------. \n"+
                			 " /   o   /| \n"+
                			 "/_______/o| \n"+
                			 "| o     | | \n"+
                			 "|   o   |o/ \n"+
                			 "|     o |/  \n"+
                			 " -------    \n",

                      		"  .-------. \n"+
                    			 " /   o   /| \n"+
                    			 "/_______/o| \n"+
                    			 "| o   o | | \n"+
                    			 "|       |o/ \n"+
                    			 "| o   o |/  \n"+
                    			 " -------    \n",

                          		"  .-------. \n"+
                        			 " /   o   /| \n"+
                        			 "/_______/o| \n"+
                        			 "| o   o | | \n"+
                        			 "|   o   |o/ \n"+
                        			 "| o   o |/  \n"+
                        			 " -------    \n",

                              		"  .-------. \n"+
                            			 " /   o   /| \n"+
                            			 "/_______/o| \n"+
                            			 "| o   o | | \n"+
                            			 "| o   o |o/ \n"+
                            			 "| o   o |/  \n"+
                            			 " -------    \n",
     };


public String[] getDie() {
		return die;
	}
	public void setDie(String[] die) {
		this.die = die;
	}
public void roll() {
        // Roll the die 10 times
        for (int i = 0; i < 9; i++) {

            // Generate a random die face and print it

            System.out.println();
            System.out.println();
            System.out.println(cube[i]);
            System.out.println();
            System.out.println();
            // Wait for 500 milliseconds before rolling again
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
