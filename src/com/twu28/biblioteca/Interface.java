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

    private final boolean TESTRUN = true;
    private static final int NO_OF_MENU_OPTIONS = 4;

    public int showMessage(String message) {
        System.out.println(message);
        return message.length();
    }

    public void showMenu() {
        showMessage("1.Display All Books in Library");
        showMessage("2.Reserve A Book in The Library");
        showMessage("3.View My Profile");
        showMessage("4.Exit");
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
                this.reserveBookInLibrary(user);
                break;
            case 2:
                this.viewUsersProfile(user);
                break;
            case 3:
                this.quitProgram();
                break;
            default:
                this.showMessage("Please Select A Valid Menu Option") ;
        }
        return true;
    }
}
