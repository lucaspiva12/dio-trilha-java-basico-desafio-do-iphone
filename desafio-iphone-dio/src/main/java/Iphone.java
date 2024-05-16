public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new Reprodutor();
        reprodutor.selecionarMusica("In Bloom (Nirvana)");
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        aparelhoTelefonico.ligar("984128970");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegarNaInternet navegarNaInternet = new Nevegar();
        navegarNaInternet.exibirPagina("http://qualquercoisa.com");
        navegarNaInternet.adicionarNovaAba();
        navegarNaInternet.atualiazarPagina();

    }
}
