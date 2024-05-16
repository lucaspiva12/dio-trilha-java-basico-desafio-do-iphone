public class Nevegar implements NavegarNaInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina aberta!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualiazarPagina() {
        System.out.println("Pagina atualizazda!");
    }
}
