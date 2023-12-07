package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class teste {
    public static void main(String[] args) {
        
        Civic c1 = new Civic(100);
        c1.acelerar();
        System.out.println("Civic acelerou: " + c1.velocidade);
        c1.frear();    
        c1.frear();    
        c1.frear();    
        c1.frear();
        System.out.println("Civic freou: " + c1.velocidade);
        
        Ferrari f1 = new Ferrari(400);
        f1.acelerar();
        f1.ligarTurbo(); 
        System.out.println("Ferrari acelerou: " + f1.velocidade);
        f1.frear();
        f1.frear();
        f1.frear();
        f1.frear();
        System.out.println("Ferrari freou: " + f1.velocidade);
        System.out.println(f1.velocidadeDoAr());
    }
}
