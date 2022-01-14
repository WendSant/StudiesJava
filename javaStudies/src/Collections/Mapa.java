package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Wend");
        users.put(2, "Gon");
        users.put(5, "Killua");
        users.put(3, "Rimuru");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(20));
        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(3));
        System.out.println(users.remove(1));
        System.out.println(users.remove(3, "Gui"));

        for (int keys : users.keySet()) {
            System.out.println(keys);
        }

        for (String string : users.values()) {
            System.out.println(string);
        }

        for (Entry<Integer, String> register : users.entrySet()) {
            System.out.print(register.getKey() + " ==> ");
            System.out.println(register.getValue());
        }

    }
}
