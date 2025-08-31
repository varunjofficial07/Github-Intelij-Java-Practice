package rentalplatform;

import java.util.ArrayList;
import java.util.List;

public class RiderList {
    public static List<User> rider = new ArrayList<>();

    static {
        rider.add(new User(11,"ramesh", 33,"rider", "kk nagar"));
        rider.add(new User(12,"kamesh", 33,"rider", "kk nagar"));

    }
}
