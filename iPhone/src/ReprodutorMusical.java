
import java.util.Scanner;

public class ReprodutorMusical {
    MenuPrincipal menuPrincipal;
    Scanner teclado = new Scanner(System.in);
    String musicaAtual;
    boolean musicaPausada = true;
    String opcao;

    public void menuReprodutor(){
        System.out.println("Bem vindo ao reprodutor de músicas");
        musicaTocando();
        System.out.println("=============================================");
        System.out.println("Funcionalidades: ");
        System.out.println("=============================================");
        System.out.println("(1) Tocar");
        System.out.println("=============================================");
        System.out.println("(2) Pausar");
        System.out.println("=============================================");
        System.out.println("(3) Selecionar música");
        System.out.println("=============================================");
        System.out.println("(4) Voltar ao Menu iPhone");
        System.out.println("=============================================");
        System.out.print("Digite a opção desejada: ");
        String opcao = teclado.nextLine();
        switch (opcao){
            case "1":
                tocar();
                break;
            case "2":
                pausar();
                break;
            case "3":
                selecionarMusica();
                break;
            case "4":
                menuPrincipal.menu();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
    
    private void tocar(){
        if (musicaPausada == true){
            if(musicaAtual != null){
                musicaPausada = false;
                System.out.println("Tocando música");
                menuReprodutor();
            }else{
                System.out.println("Nenhuma música na playlist no momento");
                menuReprodutor();
            }
        }else{
            System.out.println("Música já está tocando");
            menuReprodutor();
        }
    }

    private void pausar(){
        if (musicaPausada == true){
            System.out.println("A música já está pausada");
            menuReprodutor();
        }else{
            System.out.println("Pausando música");
            musicaPausada = true;
            menuReprodutor();
        }
    }

    private void selecionarMusica(){
        System.out.println("Digite o nome da música desejada: ");
        musicaAtual = teclado.nextLine();
        String cancelar = "n";
        do{
            if (musicaAtual != null){
                System.out.println(musicaAtual + " em reprodução");
                musicaPausada = false;
                menuReprodutor();
            }else{
                System.out.print("Deseja cancelar a operação? 'y/n' ");
                cancelar = teclado.next();
                if(cancelar != null){
                    System.out.println("Digite uma música válida");
                    selecionarMusica();
                }
        }
    }while(!cancelar.toLowerCase().equals("y"));
}
        
    private void musicaTocando(){
        if (musicaPausada == false){
            if(musicaAtual != null){
                System.out.println(musicaAtual + " está tocando no momento");
            }
        }else{
            System.out.println("Nenhuma música está em reprodução no momento");
        }
    }
}
