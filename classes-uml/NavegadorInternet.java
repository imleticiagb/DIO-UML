public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    void enviarEmail(String email, String conteudo);
    void integrarComGoogleMaps(String endereco);
}
