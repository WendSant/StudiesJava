package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Offer e add adicionam elementos na fila
        // Diferença é o comportamento, add retorna false e offer retornar exceção

        queue.add("Anna");
        queue.offer("Carlos");
        queue.add("Bia");
        queue.offer("Daniel");
        queue.add("Rafaela");
        queue.offer("Gui");

        // Peek e element para obter o proximo elemento(sem remover)
        // A diferença é o comportamento tbm, peek retorna false e element lança uma
        // exception

        System.out.println(queue.peek());
        System.out.println(queue.element());

        // Poll e remove obvter o proximo elemento e remover
        // Diferença de comportamento quando a fila esta vazia, poll retorna false e
        // null enquanto remove lança uma exception

        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove());

    }
}
