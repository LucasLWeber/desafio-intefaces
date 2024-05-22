package iphone;

import aparelho.Navegador;
import aparelho.ReprodutorMusical;
import aparelho.Telefone;

public class IphoneSete implements Navegador, Telefone, ReprodutorMusical {

    public void exibirPagina(String url) {
        System.out.println("Busca realizada em: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void ligar(String numero){
        System.out.println("Ligando: " + numero);
    }

    public void atender(){
        System.out.println("Atender");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void tocar(){
        System.out.println("Inicinado música");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }
}
