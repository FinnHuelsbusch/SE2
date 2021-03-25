package Solid.positiv;

import java.util.Map;

public class Bibliothekar {

    private static Map<String, Book> stringBookMap;

    public static Book findBook(String author, String name){
        return stringBookMap.get(author+name);
    }
}
