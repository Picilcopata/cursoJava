package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        // Offer e Add adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia
        fila.offer("Bia"); // Retorna uma exceção
        fila.add("Ana"); // Retorna false
        fila.add("Mateus");
        fila.offer("Ricardo");

        System.out.println(fila.peek()); // Retorna false
        System.out.println(fila.element());// Retorna uma exceção
        // Peek e Element obtém o próximo elemtendo da fila (sem remover)
        
        System.out.println(fila.poll()); // obtém o elemento da fila (removendo-o)
        System.out.println(fila.poll());// retorna false
        System.out.println(fila.remove());// retorna uma exceção

    }
}
