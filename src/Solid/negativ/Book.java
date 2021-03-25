package Solid.negativ;

public class Book {
   private  String title, author, location;
   private int id;

    public Book(String title, String author, String location, int id) {
        this.title = title;
        this.author = author;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getLocation() {
        return location;
    }
}
