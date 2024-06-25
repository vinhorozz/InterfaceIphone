public class Iphone implements AparelhoTelefonico,ReprodutorMusical, NavegadorInternet {
    private String musicaAtual;
    private String pagina;


    @Override
    public void atender() {
      
        System.out.println("Recebendo ligação");
    }

    @Override
    public void iniciarCorreiodeVoz() {
      
        System.out.println("Ouvindo mensagens do correio de voz");
    }

    @Override
    public void ligar(String numero) {
      
        System.out.println("Discando para o número  "+ numero);
    }

    @Override
    public void pausar() {
      
        System.out.println("Parou reprodução de áudio");
    }

    @Override
    public void selecionarMusica(String NomeMusica) {
            musicaAtual=NomeMusica;
        
        System.out.println( "Música "+ NomeMusica + " selecionada");
        tocar();
    }

    @Override
    public void tocar() {
        if (musicaAtual!=null) {
            System.out.println("Tocando "+musicaAtual);    
        } else {
            System.out.println("Selecionar musica");    
        }
        

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de navegação");     
    }

    @Override
    public void atualizarPagina() {
        if (pagina!=null) {
            System.out.println("Atualizando página " + pagina);
        } else {
            System.out.println("Selecione uma página");

        }
        
    }

    @Override
    public void exibirPagina(String url) {
        pagina=url;
      System.out.println("Exibindo página :"+url);  
      adicionarNovaAba();      
    }

}
