public class Ball {
  private String make;
  private String color;

  public Ball(String make, String color) {
    this.make = make;
    this.color = color;
  }

  public String getMake() {
    return make;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setMake(String make) {
    this.make = make;
  }
  
  public void getColor(String color) {
    this.color = color
  }

  public copy() {
    return new Ball(make, color);
  }
}