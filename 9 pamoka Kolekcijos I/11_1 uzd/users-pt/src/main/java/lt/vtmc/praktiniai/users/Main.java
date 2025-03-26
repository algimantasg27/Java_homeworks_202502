package lt.vtmc.praktiniai.users;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(25);
        User user2 = new User(20);
        User user3 = new User(26);
        User user4 = new User(29);
        User user5 = new User(21);
        User user6 = new User(30);

        List<User> users = User.getUsersWithAge(user1.getAge(), user2.getAge(), user3.getAge(), user4.getAge(), user5.getAge(), user6.getAge());
        Integer count = Praktiniai.countUsersOlderThen25(users);
        System.out.println(count.toString());
    }
}
