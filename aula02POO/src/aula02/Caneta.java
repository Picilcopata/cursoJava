package aula02;

public class Caneta { 
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    void status(){
/*      if(this.tampada == true) {
            System.out.println("Uma caneta " + this.cor + " de ponta " + this.ponta + " que está tampada!");
        }
        else {
            System.out.println("Uma caneta " + this.cor + " de ponta " + this.ponta + " que não está tampada");            
        } */
        System.out.println("Uma caneta " + this.cor + " de ponta " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    } 

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
            
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
}
