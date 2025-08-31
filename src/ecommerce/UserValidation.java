package ecommerce;

import java.util.List;

public class UserValidation {
    String username;
    String password;


    public UserValidation(String username, String password) {
        this.username = username;
        this.password = password;
    }
    User validateUser(List<User> users){
        for(User u: users){
            if(u.getName().equals(username) && u.getPassword().equals(password) ){
                System.out.println("Valid User");
                return u;
            }
        }
        System.out.println("Invalid user");
        return null;
    }
}
