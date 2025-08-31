package rentalplatform;

import java.util.Scanner;

public class User {

    private int uId;
    private String name;
    private int age;
    private String role;
    private String location;

    public User(int uId, String name, int age, String role, String location) {
        this.uId = uId;
        this.name = name;
        this.age = age;
        this.role = role;
        this.location = location;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static void displayDrivers(){
        for(Driver u: DriverList.driver){
            System.out.println(u);
        }
    }
    public static void displayRider(){
        for(User r: RiderList.rider){
            System.out.println(r);
        }
    }
    public User(){

    }
}
