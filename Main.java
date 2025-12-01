import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new game...\n");
       String command = ""; // stores the user's choices
      
      // STEP #1: Describe the current scenario
      System.out.println("You are at Park entrance at Tilted Towers");
      // STEP #2: Get user command
      command = getCommand(" Do you go east (e) or north (n)?");
      // STEP #3: Select a path based on user input
      if ( command.equals("e") ) {
         // NEXT BRANCH...
         System.out.println("You are outside Townhouse.");
      }
      else if ( command.equals("n") ) {
         System.out.println("You continue north and can either go W or E");
      }
      else {
         System.out.println("GAME OVER! Return to LOBBY to replay...");
      }




    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
