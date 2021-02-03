public class Game {
  String team1;
  String team2;
  Ball ball;

  public Game(String team1, String team2, Ball ball) {
    this.team1 = team1;
    this.team2 = team2;
    this.ball = ball.copy();
  }
}