import javax.swing.JOptionPane;

public class Conta {
    
    public int numConta;
    public String tipo;
    public String dono;
    public double saldo;
    public boolean status;


    public Conta(int numConta, String dono, boolean status) { //constructor sei lá
        this.setNumConta(numConta);
        this.setDono(dono);
        this.setStatus(status);
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
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
     public void abrirConta(String string){
        //this.setStatus(true);
        this.setTipo(string);
        if ("CC".equals(string)) {
            this.setSaldo(50);
        }        
        else if("CP".equals(string)){
            this.setSaldo(150);
        }

    }

    public void fecharConta(){
        if (this.getStatus() == true){
            if (this.getSaldo() > 0) {
                System.out.println("Conta com dinheiro!");
            }
            else if(this.getSaldo() < 0){
                System.out.println("Conta em débito!");
            }
            else if (this.getSaldo() == 0){
                this.setStatus(false);
                System.out.println( "Conta fechada com sucesso!");
            }
        }
        else{
            System.out.println("Essa conta já está fechada!");
        }   

    }
    public void depositar(int v){
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
        } else{
            System.out.println("Impossível depositar!");            
        }

    }
    public void sacar(int v){
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
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
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() + v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }

    public void estadoAtual(){
        if (this.getStatus() == true){
            System.out.println("Número da conta: " + getNumConta());
            System.out.println("Tipo da conta: " + getTipo());
            System.out.println("Saldo: " + getSaldo());
            System.out.println("Dono:" + getDono());
        }
        else {
            System.out.println("Conta fechada." + "\n" + "Não é possível exibir suas informacoes.");
        }
    }
    

}
