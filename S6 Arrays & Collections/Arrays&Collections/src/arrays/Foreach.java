package arrays;
public class Foreach {
    public static void main(String[] args) {
        
        double[] notas = { 5.6, 8.5, 9.2, 6.6 };

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println();

        for(double nota: notas){
            System.out.println(nota);
        }
    }
}
