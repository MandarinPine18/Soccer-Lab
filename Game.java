public class Game {
  String team1;
  String team2;
  Ball ball;

  public Game(String team1, String team2, Ball ball) {
    this.team1 = team1;
    this.team2 = team2;
    this.ball = ball.copy();
  }

  public String getTeam1() {
    return team1;
  }

  public void setTeam1(String team1) {
    this.team1 = team1;
  }

  public String getTeam2() {
    return team2;
  }

  public void setTeam2(String team2) {
    this.team2 = team2;
  }

  public Ball getBall() {
    return ball;
  }

  public void setBall(Ball ball) {
    this.ball = ball.copy();
  }

  public String toString() {
    return "This match is between " + team1 + " and " + team2 + " and was played with a " + ball.getMake() + " ball that is " + ball.getColor();
  }
}