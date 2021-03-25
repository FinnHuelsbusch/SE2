package Solid.negativ;

import java.util.regex.Pattern;

class Person {
    public String name, surname, email;

    public Person(  String name,  String surname, String email){
        this.surname = surname;
        this.name = name;
        if(this.validateEmail(email)) {
            this.email = email;
        }
        else {
            throw new Error("Invalid email!");
        }
    }

    private boolean validateEmail(  String email ) {
        Pattern  regex = Pattern.compile("^(.+)@(.+)$");
        return regex.matcher(email).find();
    }
    public void greet() {
        System.out.println("Hi!");
    }
}
