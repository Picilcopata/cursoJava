package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<Usuario> usuarios = new HashSet<>();
        
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Jão"));
        usuarios.add(new Usuario("Ana"));

        System.out.println(usuarios.contains(new Usuario("Guilherme")));
    }
}
