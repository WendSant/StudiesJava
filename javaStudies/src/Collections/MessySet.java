package Collections;

import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.xml.transform.stream.StreamSource;

public class MessySet {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        set1.add(1.5);
        set1.add(false);
        set1.add("Cara");
        set1.add('s');
        set1.add(8);

        System.out.println("Size " + set1.size());

        set1.add("Cara");
        set1.add(8);
        System.out.println("Size " + set1.size());

        System.out.println(set1.remove(8));
        System.out.println(set1.remove('s'));
        System.out.println(set1.remove("Arara"));

        System.out.println("Size " + set1.size());
        System.out.println(set1.contains('s'));
        System.out.println(set1.contains(1.5));
        System.out.println(set1.contains(false));

        Set nums = new HashSet();
        nums.add(1.5);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(set1);

        set1.retainAll(nums);
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

    }
}
