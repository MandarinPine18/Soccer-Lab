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
    // these are the hardcoded values for the objects
    // arrays are used to keep the data organized and readable as well as to make getting user input much more straightforward
    String[][] teams = {
            {"Manchester United", "Southampton"},
            {"Newcastle", "Crystal Palace"}
    };
    Ball[] balls = {
            new Ball("Nike", "white"),
            new Ball("Wilson", "red")
    };

    // if in user input mode, the user will be asked to enter the above values
    if (userInputMode) {
      // this is a way for me to easily separate the inputs between the games for the user
      String[] headers = {"First game information: ", "\nSecond game information: "};

      // this loop gets the information for both the games
      for (int i = 0; i < 2; i++) {
        System.out.println(headers[i]);
        teams[i][0] = input("Please enter the name of the first team: ");
        teams[i][1] = input("Please enter the name of the second team: ");
        balls[i].setMake(input("Please enter the make of the ball: "));
        balls[i].setColor(input("Please enter the color of the ball: "));
      }
      System.out.println();
    }

    // make the games from the information previously written or requested
    Game[] games = {
            new Game(teams[0][0], teams[0][1], balls[0]),
            new Game(teams[1][0], teams[1][1], balls[1])
    };

    System.out.println(games[0]);
    System.out.println(games[1]);

    // I will alter the ball of the second game
    System.out.println();
    games[1].getBall().setColor("blue");

    System.out.println(games[0]);
    System.out.println(games[1]);
  }

  // This just abstracts the process of getting input
  public static String input(String prompt) {
    System.out.print(prompt);
    return input.nextLine();
  }
}