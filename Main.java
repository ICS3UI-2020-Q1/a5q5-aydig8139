import java.util.Scanner;

/**
 * Draws a line of *s
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number and declare a variable to store it 
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();

    for(int count = 1; count <= userNum; count++){
      System.out.print("*");
    }
    
  }
}
