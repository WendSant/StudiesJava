package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComportedSet {
    public static void main(String[] args) {

        // Set<String> list = new HashSet<>();
        SortedSet<String> list = new TreeSet<>();

        list.add("Ana");
        list.add("Marcos");
        list.add("Lucas");
        list.add("Carlos");

        for (String cadit : list) {
            System.out.println(cadit);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(95);
        nums.add(15);
        nums.add(8);

        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
