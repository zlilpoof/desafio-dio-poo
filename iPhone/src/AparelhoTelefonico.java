import java.util.Scanner;

public class AparelhoTelefonico {
    MenuPrincipal menuPrincipal;
    Scanner teclado = new Scanner(System.in);

    public void menuTelefone(){
        System.out.println("Bem vindo ao iPhone");
        System.out.println("=============================================");
        System.out.println("Funcionalidades: ");
        System.out.println("=============================================");
        System.out.println("(1) Ligar");
        System.out.println("=============================================");
        System.out.println("(2) Atender");
        System.out.println("=============================================");
        System.out.println("(3) Correio de Voz");
        System.out.println("=============================================");
        System.out.println("(4) Voltar ao Menu iPhone");
        System.out.println("=============================================");
        System.out.print("Digite a opção desejada: ");
        String opcao = teclado.nextLine();
        switch (opcao){
            case "1":
                ligar();
                break;
            case "2":
                atender();
                break;
            case "3":
                iniciarCorreioVoz();
                break;
            case "4":
                menuPrincipal.menu();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private void ligar(){
        long numeroContato = 0;
        String cancelar = "n";
        do{
            System.out.println("Digite o número desejado: ");
            numeroContato = teclado.nextLong();

            if(numeroContato != 0){
                System.out.println("Ligando");
                System.out.println("Deseja desligar? 'y/n' ");
                cancelar = teclado.next();
                if(cancelar.toLowerCase() == "y"){
                    System.out.println("Ligação desligada");
                    menuTelefone();
                }else{
                    do{
                        System.out.println("Digite quando desejar encerrar: ");
                        cancelar = teclado.next();
                        if(cancelar.toLowerCase().equals("y")){
                            System.out.println("Ligação desligada");
                            menuTelefone();
                        }
                    }while(cancelar.toLowerCase() != "y");
                    
                }
            }else{
                System.out.println("Digite um número válido");
                ligar();
            }
        }while(cancelar.toLowerCase() != "y");
        
    }

    private void atender(){
        String desligar;
        System.out.println("Atendendo");
        do{
            System.out.println("Deseja desligar a chamada? 'y/n' ");
            desligar = teclado.next();

            if(desligar.toLowerCase().equals("y")){
                System.out.println("Chamada encerrada");
                menuTelefone();
            }else{
                System.out.println("Digite y quando desejar");
            }
        }while(!desligar.toLowerCase().equals("y"));
    }

    private void iniciarCorreioVoz(){
        String desligar;
        System.out.println("Iniciando o correio de voz");
        do{
            System.out.println("Deseja desligar o correio de voz? 'y/n' ");
            desligar = teclado.next();

            if(desligar.toLowerCase().equals("y")){
                System.out.println("Correio de voz encerrado");
                menuTelefone();
            }else{
                System.out.println("Digite y quando desejar");
            }
        }while(!desligar.toLowerCase().equals("y"));
    }
}
