package ecommerce;

import java.util.List;

public class AdminValidation {
    String username;
    String password;


    public AdminValidation(String username, String password) {
        this.username = username;
        this.password = password;
    }
    Admin validateAdmin(List<Admin> admins){
        for(Admin admin: admins){
            if(admin.getName().equals(username) && admin.getPassword().equals(password) ){
                System.out.println("Valid User");
                return admin;
            }
        }
        System.out.println("Invalid user");
        return null;
    }
}
