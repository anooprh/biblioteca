package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/22/12
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {
    public static void main(String[] args){
        Interface console = new Interface();
        Library library = new Library();
        User user;
        int loginType = 0;//1 For Registered User,2 For Guest

        while (true){
            console.showMessage("Welcome To the Library");
            console.showLoginOptions();
            loginType = console.waitForLoginType();
            if(loginType == 2){//Guest Type Login
                console.showMessage("You are Entering The Library As A Guest");
               user = new User();
               user.addTothisLibrary(library) ;
            }
            else{
                User temp_user = new User(console.getLibraryID(),console.getPassword());
                user =  library.findUser(temp_user);
                if(user == null){
                    console.showMessage("Wrong UserName/Password..Try Again");
                    temp_user = new User(console.getLibraryID(),console.getPassword());
                    user =  library.findUser(temp_user);
                    if(user == null) {
                        console.showMessage("Wrong UserName/Password..You are Entering as a Guest");
                        user = new User();
                        user.addTothisLibrary(library) ;
                        loginType = 2;
                    }
                }
                else {
                    console.showMessage("You are a registered user.Wellcome");

                }
            }
            if(loginType == 1){ //Logged in as Registered User
                console.showMenu();
                console.waitForMenuSelection(user);
            }
            else if (loginType == 2){ //Logged in as a guest
                console.showGuestMenu();
                console.waitForGuestMenuSelection(user);
            }
        }
    }
}


