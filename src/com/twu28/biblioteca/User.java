package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String Name;
    private char Gender;
    private int Age;
    private long LibraryNumber;

    public User(String Name, char Gender, int Age, long LibraryNumber) {
        this.setName(Name);
        this.setGender(Gender);
        this.setAge(Age);
        this.setLibraryNumber(LibraryNumber);

        return;
    }

    public User() {
        this.setName(" ");
        this.setGender(' ');
        this.setAge(0);
        this.setLibraryNumber(0);

        return;
    }

    private void setLibraryNumber(long LibraryNumber) {
        this.LibraryNumber = LibraryNumber;
        return;
    }

    private void setAge(int Age) {
        this.Age = Age;
        return;
    }

    private void setGender(char Gender) {
        this.Gender = Gender;
        return;
    }

    private void setName(String Name) {
        this.Name = Name;
        return;
    }


}
