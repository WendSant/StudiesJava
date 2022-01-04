package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stackk {
    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<String>();

        books.add("Harry Potter e a pedra de crack");
        books.push("Percy Jackson e o ladrão de cu");
        books.push("John Wick");

        System.out.println(books.peek());
        System.out.println(books.element());

        for (String s : books) {
            System.out.println(s);
        }

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.pop());

    }
}
