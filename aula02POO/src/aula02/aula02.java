package aula02;
public class aula02 {
    public static void main(String[] args) throws Exception {
        
        Caneta caneta1 = new Caneta();
        caneta1.cor = "preta";
        caneta1.setPonta(0.7f);
       /*caneta1.tampada = false;*/
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();

        /*Caneta caneta2 = new Caneta();
        caneta2.modelo = "Bic";
        caneta2.cor = "vermelha";
        caneta2.ponta = 0.5f;
        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();*/
    }
}
