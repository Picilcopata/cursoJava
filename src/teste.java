import javax.swing.JOptionPane;

public class TesteConta {
    
    private int numConta;
    private char tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public TesteConta() { // Construtor sem parâmetros
        this.saldo = 0.0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        this.status = true;
        setTipo(tipo);
        if (tipo.equals("CC")) {
            saldo = 50.0;
        } else if(tipo.equals("CP")){
            saldo = 150.0;
        }
    } 

    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro!");
        } else if(saldo < 0){
            System.out.println("Conta em débito!");
        }
        this.status = false;
    }

    public void depositar(double valor){
        if (status == true) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar!");            
        }
    }

    public void sacar(double valor){
        if (status == true) {
            if (saldo >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Impossível sacar!");
            }
        } else {
            System.out.println("Não é possível realizar o saque!");
        }
    }

    public void pagarMensal(){
        double v;
        if (tipo == 'CC') {
            v = 12.0;
        } else if (tipo == 'CP') {
            v = 20.0;
        } else {
            v = 0.0;
        }
        if (status == true) {
            if (saldo >= v) {
                setSaldo(getSaldo() - v);
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

    public char getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.charAt(0);
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
}
