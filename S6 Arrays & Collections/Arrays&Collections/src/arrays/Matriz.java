package arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System .in);

        System.out.println("Quantos alunos? ");
        int qntdAlunos = entrada.nextInt();
        
        System.out.println("Quantas notas por aluno? ");
        int qntdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qntdAlunos] [qntdNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma.length; n++) {
                
                System.out.printf("Informe a nota %d do aluno %d: ", (n+1),(a+1));
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qntdAlunos * qntdNotas);
        System.out.println("Média da turma: " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        System.out.println(Arrays.toString(notasDaTurma));
        
        entrada.close();
    }
}
