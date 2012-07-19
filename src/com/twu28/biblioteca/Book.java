package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private boolean availability;
    private String ISBNNumber;
    private int NumberOfCopies;
    private int YearOfPublication;
    private int Edition;
    private String Publisher;
    private String Author;
    private String Title;


    public Book() {
        this.availability = true;
        return;
    }

    public Book(String ISBNNumber) {
        //To change body of created methods use File | Settings | File Templates.
        this.setISBNNumber(ISBNNumber);
        return;
    }

    public Book(String ISBNNumber, String Title, String Author, String Publisher,
                int Edition, int YearOfPublication, int NumberOfCopies){
        this.setISBNNumber(ISBNNumber);
        this.setTitle(Title);
        this.setAuthor(Author);
        this.setPublisher(Publisher);
        this.setEdition(Edition);
        this.setYearOfPublication(YearOfPublication);
        this.setNumberOfCopies(NumberOfCopies);
    //    this.availability = true;
        return;
    }

    private void setNumberOfCopies(int NumberOfCopies) {
        this.NumberOfCopies = NumberOfCopies;

        if(NumberOfCopies > 0)
            setAvailability(true);
        else
            setAvailability(false);

        return;
    }

    private void setYearOfPublication(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
        return;
    }

    private void setEdition(int Edition) {
        this.Edition = Edition;
        return;
    }

    private void setPublisher(String Publisher) {
        this.Publisher = Publisher;
        return;
    }

    private void setAuthor(String Author) {
        this.Author = Author;
        return;
    }

    private void setTitle(String Title) {
        this.Title = Title;
        return;
    }


    private void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
        return;
    }


    public boolean isAvailable() {
        //To change body of created methods use File | Settings | File Templates.
        return getAvailability();

    }

    private boolean getAvailability() {
        //To change body of created methods use File | Settings | File Templates.
        return this.availability;
    }

    public boolean reserveBook() {
        //To change body of created methods use File | Settings | File Templates.
        this.setAvailability(false);
        return true;
    }

    private void setAvailability(boolean status) {
        //To change body of created methods use File | Settings | File Templates.
        this.availability = status;
        return;
    }

    public boolean displayBookDetails() {
        System.out.print(this.ISBNNumber+"\t\t");
        System.out.print(this.Title+"\t\t");
        System.out.print(this.Author+"\t\t");
        System.out.print(this.Publisher+"\t\t");
        System.out.print(this.Edition+"\t\t");
        System.out.print(this.YearOfPublication+"\t\t");
        System.out.print(this.NumberOfCopies+"\t\t");
        System.out.print("\n");
        return true;
    }
}
