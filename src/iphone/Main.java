package iphone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IphoneSete iphone = new IphoneSete();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma funcionalidade de seu Iphone 7:\n1.Reprodutor Musical\n2.Navegador de Internet\n3.Telefone");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:{
                System.out.println("Escolha uma funcionalidade do seu Reprodutor Musical:\n1.Tocar\n2.Pausar\n3.Selecionar Musica");
                int opcaoReprodutor = sc.nextInt();
                switch (opcaoReprodutor) {
                    case 1:{
                        iphone.tocar();
                        break;
                    }
                    case 2:{
                        iphone.pausar();
                        break;
                    }
                    case 3:{
                        System.out.print("Digite a música: ");
                        String musica = sc.next();
                        iphone.selecionarMusica(musica);
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Escolha uma funcionalidade do seu Navegador de Internet:\n1.Exibir página\n2.Adicionar nova aba\n3.Atualizar página");
                int opcaoNavegador = sc.nextInt();
                switch (opcaoNavegador) {
                    case 1:{
                        System.out.print("Digite a página: ");
                        String pagina = sc.next();
                        iphone.exibirPagina(pagina);
                        break;
                    }
                    case 2:{
                        iphone.adicionarNovaAba();
                        break;
                    }
                    case 3:{
                        iphone.atualizarPagina();
                        break;
                    }
                }
            }
            case 3:{
                System.out.println("Escolha uma funcionalidade do seu Telefone:\n1.Ligar\n2.Atender\n3.Iniciar correio de Voz");
                int opcaoTelefone = sc.nextInt();
                switch (opcaoTelefone) {
                    case 1:{
                        System.out.print("Digite o número: ");
                        String numero = sc.next();
                        iphone.ligar(numero);
                        break;
                    }
                    case 2:{
                        iphone.atender();
                        break;
                    }
                    case 3:{
                        iphone.iniciarCorreioVoz();
                        break;
                    }
                }
            }
        }
    }
}
