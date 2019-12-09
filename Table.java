public class Table{
  // Attributes
  private double width;
  private double height;
  // Constructors
  public Table(){
    width = 60;
    height = 36;
  }
  public Table(double width){
    this.width = width;
    height = 36;
  }
  public Table(double width, double height){
    this.width = width;
    this.height = height;
  }

  public double getWidth(){ return width; }
  public double getHeight(){ return height; }
  public void setWidth(double width){ this.width = width; }
  public void setHeight(double height){ this.height = height; }
}
