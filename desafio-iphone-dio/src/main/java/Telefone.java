public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        System.out.println("Chamando!!!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }
}
