package Collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("Wend");
        list.add(u1);

        list.add(new User("Carlos"));
        list.add(new User("Manu"));
        list.add(new User("Bia"));
        list.add(new User("João"));

        System.out.println(list.get(3));

        System.out.println(">>>" + list.remove(1));
        System.out.println(list.remove(new User("João")));
        System.out.println("tem?" + list.contains(new User("Bia")));
        System.out.println("tem" + list.contains(u1));

        for (User user : list) {
            System.out.println(user.name);
        }

    }
}
