package services;

import models.User;

public class AccountService {
    //class to validate user login info
    //code was provide in lecture, credit to author

    public User login(String username, String password) {
        if (((username.equals("abe")  || username.equals("barb")) && password.equals("password")))
            return new User(username, null);
        
        
        return null;
    }

}
