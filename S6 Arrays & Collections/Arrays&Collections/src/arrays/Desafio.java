package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos: ");
        int qntdNotas = entrada.nextInt();

        double[] notas = new double[qntdNotas]; // Array das notas
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota: ");
            notas[i] = entrada.nextDouble();
        }
        
        double mediaAluno = 0; // variável para o laço FOR
        for (int i = 0; i < notas.length; i++) {
            mediaAluno += notas[i];
        }
        System.out.println("Média do aluno: " + mediaAluno / notas.length);
        for(double notasTotais: notas){
            System.out.println(Arrays.toString(notas));
        }

        entrada.close();
    }
}
