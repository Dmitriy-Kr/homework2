package com.homework2;

public class Human {
    private String name;
    private String surname;
    private String middleName;

    public Human(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String surname, String name, String middleName) {
        this(surname, name);
        this.middleName = middleName;
    }

    public String getFullName() {
        return surname + " " + name + " " + (middleName == null? "" : middleName);
    }

    public String getShortName() {
        return surname + " " + name.charAt(0) + "." + (middleName == null? "" : middleName.charAt(0) + ".");
    }
}
