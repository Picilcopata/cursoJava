public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(123, "carol", true);
        c1.abrirConta("CC");
        //c1.fecharConta();
        //c1.estadoAtual();
        //c1.setStatus(true);
        //c1.setTipo("CP");
        c1.depositar(50);
        c1.sacar(1000);
        c1.estadoAtual();
    }
}
