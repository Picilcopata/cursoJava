import javax.swing.JOptionPane;

public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    public Conta(double saldo, boolean status) { //constructor sei lá
        this.saldo = 0f;
        this.status = false;
    }
    public void abrirConta(String string){
        this.status = true;
        setTipo(string);
        if ("CC".equals(string)) {
            saldo = 50f;
        }        
        else if("CP".equals(string)){
            saldo = 150f;
        }

    } 
    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro!");
        }
        else if(saldo < 0){
            System.out.println("Conta em débito!");
        }
        this.status = false;

    }
    public void depositar(int v){
        if (status = true) {
            setSaldo(getSaldo() + v);
        } else{
            System.out.println("Impossível depositar!");            
        }

    }
    public void sacar(int v){
        if (status = true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Impossível sacar!");
            }
            
        } else {
            System.out.println("Não é possível realizar o saque!");
        }
    }
    public void pagarMensal(int v){
        if ("CC".equals(tipo)) {
            v = 12;
        } else if ("CP".equals(tipo)) {
            v = 20;
        }
        if (status = true) {
            if (saldo > v) {
                setSaldo(getSaldo() + v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String string) {
        this.tipo = string;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual(){
        System.out.println(getNumConta());
        System.out.println(getTipo());
        System.out.println(getSaldo());
        System.out.println(getDono());
    }
    

}
