package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("Wend"));
        users.add(new User("Gon"));
        users.add(new User("Gui-"));

        boolean result = users.contains(new User("Wend"));
        System.out.println(result);

    }
}
