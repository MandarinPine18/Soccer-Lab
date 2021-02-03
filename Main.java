import java.util.Scanner;

public class Main {
  // although I have abstracted input functionality below, declaring it here allows me to access the input object directly from the main method, just in case
  public static final Scanner input = new Scanner(System.in);

  /* I found in the instructions, it wasn't entirely clear if I was supposed to take user input or just hardcode values
   * for demonstration. The following boolean sets which mode to run the program in. To run with user input, please set
   * it to true. To run with hardcoded values, please set this to false.
   *
   * By default, the program will run with no user input
   */
  public static final boolean userInputMode = false;

  public static void main(String[] args) {
  }

  // This just abstracts the process of getting input
  public static String input(String prompt) {
    System.out.print(prompt);
    return input.nextLine();
  }
}