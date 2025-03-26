package lt.vtmc.praktiniai.users;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        List<Integer> listAge = new ArrayList<Integer>();
        for (User user: users) {
            if (user.getAge() > 25) {
                listAge.add(user.getAge());
            }

        }
        return listAge.size();
//        throw new UnsupportedOperationException("Not implemented");
    }

    public static double getAverageAge(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

    // TODO: Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static User findByName(List<User> users, String name) {
        throw new UnsupportedOperationException("Not implemented");
    }

    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int sumAge(List<User> users) {
        throw new UnsupportedOperationException("Not implemented");
    }

}
