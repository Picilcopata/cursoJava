package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Jão");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        System.out.println(lista.get(3)); // acesso pelo índice, diferentemente do Set.

        System.out.println(lista.remove(1));
        lista.remove(new Usuario("Manu"));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }

    }
}
