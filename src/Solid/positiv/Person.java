package Solid.positiv;

class Person {
  public Book lendBook(String title, String author){
      return Bibliothekar.findBook(author, title);
  }
}
