public class Table{
  double width, height;

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
}
