public class AnimatedCube {
    public static void main(String[] args) {
        // Define the cube as an array of strings
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
                	"	  \\O____O\\/ \n",
                 "    	   .-------. \n"+
       			 " 	  /       /| \n"+
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

                      			 		 "	    ______\n"+
                               			 " 	   /\\     \\ \n"+
                               			 "	  /o \\  o  \\ \n"+
                               			 "	 /   o\\_____\\ \n"+
                               			 "	 \\o   /o    / \n"+
                               			 "	  \\ o/  o  / \n"+
                               			 " 	   \\/____o/ \n",
                               	      
                         		"  .-------. \n"+
                             			 " /   o   /| \n"+
                             			 "/_______/o| \n"+
                             			 "| o   o | | \n"+
                             			 "|       |o/ \n"+
                             			 "| o   o |/  \n"+
                             			 " -------    \n",

                             "	    ______\n"+
                   			 " 	   /\\     \\ \n"+
                   			 "	  /o \\  o  \\ \n"+
                   			 "	 /   o\\_____\\ \n"+
                   			 "	 \\o   /o    / \n"+
                   			 "	  \\ o/  o  / \n"+
                   			 " 	   \\/____o/ \n",
                   	      
                     		"  .-------. \n"+
                   			 " /   o   /| \n"+
                   			 "/_______/o| \n"+
                   			 "| o   o | | \n"+
                   			 "|   o   |o/ \n"+
                   			 "| o   o |/  \n"+
                   			 " -------    \n",
                        
         			 
                           	 	
                           	" 		   _______  \n"+
                           	"		  /O     /\\  \n"+
                           	"		 /   O  /O \\ \n"+
                           	"		/_____O/    \\  \n"+
                           	"		\\O    O\\    /  \n"+
                           	"		 \\O    O\\ O/  \n"+
                           	" 		  \\O____O\\/ \n",
                           	
                     		"  .-------. \n"+
                   			 " /       /| \n"+
                   			 "/_______/ | \n"+
                   			 "| o   o | | \n"+
                   			 "| o   o | / \n"+
                   			 "| o   o |/  \n"+
                   			 " -------    \n",
                    };
        String[] die = {
        		"    -------\n" +
        				"   /       /|\n" +
        				"  /       / |\n" +
        				" +-------+  |\n" +
        				" |       |  |\n" +
        				" |   O   |  +\n" +
        				" |       | /\n" +
        				" |       |/\n" +
        				" +-------+",
        				
        				
        				"    -------\n" +
        						"   /       /|\n" +
        						"  /       / |\n" +
        						" +-------+  |\n" +
        						" | O     |  |\n" +
        						" |       |  +\n" +
        						" |     O | /\n" +
        						" |       |/\n" +
        						" +-------+",
        						
        						
        						"    -------\n" +
        								"   /       /|\n" +
        								"  /       / |\n" +
        								" +-------+  |\n" +
        								" | O     |  |\n" +
        								" |   O   |  +\n" +
        								" |     O | /\n" +
        								" |       |/\n" +
        								" +-------+",
        								
        								
        								"    -------\n" +
        										"   /       /|\n" +
        										"  /       / |\n" +
        										" +-------+  |\n" +
        										" | O   O |  |\n" +
        										" |       |  +\n" +
        										" | O   O | /\n" +
        										" |       |/\n" +
        										" +-------+",
        										
        										
        										"    -------\n" +
        												"   /       /|\n" +
        												"  /       / |\n" +
        												" +-------+  |\n" +
        												" | O   O |  |\n" +
        												" |   O   |  +\n" +
        												" | O   O | /\n" +
        												" |       |/\n" +
        												" +-------+",
        												
        												"    -------\n" +
        														"   /       /|\n" +
        														"  /       / |\n" +
        														" +-------+  |\n" +
        														" | O   O |  |\n" +
        														" | O   O |  +\n" +
        														" | O   O | /\n" +
        														" |       |/\n" +
        														" +-------+"
        };

        // Loop through the cube frames 10 times
        for (int i = 0; i < 10; i++) {

            // Print the current frame of the cube at the current position
            int index = i % cube.length;
           	System.out.println();
           	System.out.println();
           	System.out.println(cube[index]);

            // Wait for 500 milliseconds before printing the next frame
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
