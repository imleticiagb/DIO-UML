public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void enviarEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email + " com conteúdo: " + conteudo);
    }

    @Override
    public void integrarComGoogleMaps(String endereco) {
        System.out.println("Integrando com Google Maps para o endereço: " + endereco);
    }

    public void detectarToque() {
        System.out.println("Detectando toque");
    }

    public void detectarMultiTouch() {
        System.out.println("Detectando multi-touch");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.tocar();
        meuIphone.selecionarMusica("Taste of the divine - SHAKER");
        meuIphone.ligar("123456789");
        meuIphone.exibirPagina("https://github.com/imleticiagb/DIO-UML/tree/main");
        meuIphone.enviarEmail("exemplo@exemplo.com", "Olá, este é um email de teste.");
        meuIphone.integrarComGoogleMaps("123 Main St, Anytown, USA");
        meuIphone.detectarToque();
        meuIphone.detectarMultiTouch();
    }
}
