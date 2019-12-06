public class Book{
  int pages;
  String name;
  public Book(){
    pages = 100;
    name = "My Book";
  }
  public Book(int numPages, String myName){
    pages = numPages;
    name = myName;
  }
  public int getPages(){
    return pages;
  }


}
