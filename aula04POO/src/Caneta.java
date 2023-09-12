public class Caneta {
    
    public String modelo, cor;
    private float ponta;
    private boolean tampar;

    public void Caneta(){

        this.tampar();
        this.cor();
    }

    public void cor() {
        tampar() = true;

    }

    public void tampar() {
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
    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }
    
    public void tampada(){
        this.tampar = true;
    }
    public void destampada(){
        this.tampar = false;
    }

    public void status(){
        System.out.println("Modelo: " + getModelo() + "\n" + "Ponta: " + getPonta() + "\n");
        System.out.println("Tampada? " + tampar());
    }
}
