public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(0, false);
        c1.setNumConta(1111);
        c1.setDono("Lucas");
        c1.abrirConta("CC");
        c1.estadoAtual();
    }
}
