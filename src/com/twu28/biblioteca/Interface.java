package com.twu28.biblioteca;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/19/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interface {

    private final boolean TESTRUN = false;
    private static final int NO_OF_MENU_OPTIONS = 4;
    private long libraryID;
    private String password;

    public int showMessage(String message) {
        System.out.println(message);
        return message.length();
    }

    public void showMenu() {
        showMessage("1.Display All Books in Library");
        showMessage("2.Reserve A Book in The Library");
        showMessage("3.Display Movies in The Library");
        showMessage("4.View My Profile");
        showMessage("5.Exit");
    }

    public boolean displayBooksInLibrary(User userObject) {
        return userObject.viewAllBooksInMyLibrary();
    }

    public boolean reserveBookInLibrary(User userObject) {

        String ISBNRequired;

        if(TESTRUN)
            ISBNRequired = "1234567890123";
        else{
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter The ISBN Number Of The Book You Want");
            ISBNRequired = reader.nextLine();
        }
        return userObject.reserveBookInLibrary(ISBNRequired);
    }

    public boolean viewUsersProfile(User userObject) {

        return userObject.viewMyProfileInTheLibrary(userObject.getMemberofLibrary());
    }

    public boolean quitProgram() {
        if(!TESTRUN){
            System.exit(0);
        }
        return true;
    }

    public boolean waitForMenuSelection(User user) {
        int menuOptionSelected = -1;

        Scanner reader = new Scanner(System.in);
        if(!TESTRUN){
            menuOptionSelected = reader.nextInt();
            menuOptionSelected --;
        }
        else{
            Random random = new Random();
            menuOptionSelected = random.nextInt() % NO_OF_MENU_OPTIONS;

        }

        switch (menuOptionSelected){
            case 0:
                this.displayBooksInLibrary(user);
                break;
            case 1:
                if(true == this.reserveBookInLibrary(user)){
                    this.showMessage("Thank You! Enjoy the book");
                }
                else{
                    this.showMessage("Sorry we don't have that book");
                }

                break;
            case 2:
                this.viewMovieList(user);
                break;
            case 3:
                this.viewUsersProfile(user);
                break;
            case 4:
                this.quitProgram();
                break;
            default:
                this.showMessage("Please Select A Valid Menu Option") ;
                this.showMenu();
                return this.waitForMenuSelection(user);
        }
        return true;
    }

    public boolean viewMovieList(User user) {
        return user.displayMoviesList();
    }

    public boolean showLoginOptions() {
        this.showMessage("1.Registered Users Login with your ID");
        this.showMessage("2.Login as Guest");
        return true;
    }

    public int waitForLoginType() {
        Scanner scanner = new Scanner(System.in);
        int type_selected = 0;
        if(TESTRUN){
            type_selected = 1;
        }
        else{
            type_selected = scanner.nextInt();
            if((type_selected != 1) && (type_selected != 2)){
                this.showMessage("Select a Valid Option");
                type_selected = this.waitForLoginType();
            }
        }
        return type_selected;  //To change body of created methods use File | Settings | File Templates.
    }

    public long getLibraryID() {
        Scanner scanner = new Scanner(System.in);
        long LibraryID;
        this.showMessage("Enter Your 7 digit Library Number :");
        try{
            LibraryID = scanner.nextLong();
        }
        catch(Exception ex) {
            this.showMessage("Only 0-9 are allowed:");
            return this.getLibraryID();
        }

        return LibraryID;
    }

    public String getPassword() {
        Scanner scanner = new Scanner(System.in);
        this.showMessage("Enter Your Password :");
        return scanner.nextLine();
    }

    public void showGuestMenu() {
        showMessage("1.Display All Books in Library");
        showMessage("2.Reserve A Book in The Library--------NOT AVAILABLEFOR GUEST!!SORRY");
        showMessage("3.Display Movies in The Library");
        showMessage("4.View My Profile--------NOT AVAILABLEFOR GUEST!!SORRY");
        showMessage("5.Exit");

    }

    public boolean waitForGuestMenuSelection(User user) {
        int menuOptionSelected = -1;

        Scanner reader = new Scanner(System.in);
        if(!TESTRUN){
            menuOptionSelected = reader.nextInt();
            menuOptionSelected --;
        }
        else{
            Random random = new Random();
            menuOptionSelected = random.nextInt() % NO_OF_MENU_OPTIONS;

        }

        switch (menuOptionSelected){
            case 0:
                this.displayBooksInLibrary(user);
                break;

            case 2:
                this.viewMovieList(user);
                break;

            case 4:
                this.quitProgram();
                break;

            default:
                this.showMessage("Please Select A Valid Menu Option") ;
                this.showGuestMenu();
                return this.waitForGuestMenuSelection(user);
        }
        return true;

    }


}
