public class Caneta {
    
    public String modelo, cor;
    private float ponta;
    private boolean tampar;



    public Caneta(String modelo, String cor, float ponta, boolean tampar) {
        this.modelo = "BIC";
        this.cor = "azul";
        this.ponta = 0.5f;
        this.tampar = true;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setTampar(boolean tampar) {
        this.tampar = tampar;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public boolean isTampar() {
        return tampar;
    }

    
    public void tampada(){
        this.tampar = true;
    }
    public void destampada(){
        this.tampar = false;
    }

    public void status(){
        System.out.println("Modelo: " + getModelo() + "\n" + "Cor: " + getCor() + "\n" + "Ponta: " + getPonta() + "\n" + "Tampada? " + isTampar());
    }

}
