import java.util.ArrayList;
import java.util.Scanner;

public class NavegadorInternet {
    MenuPrincipal menuPrincipal;
    Scanner teclado = new Scanner(System.in);
    int n;
    ArrayList<String> abasAtuais = new ArrayList<>();

    public void menuNavegador(){
        System.out.println("Bem vindo ao Navegador de Internet");
        System.out.println("=============================================");
        System.out.println("Funcionalidades: ");
        System.out.println("=============================================");
        System.out.println("(1) Exibir Página");
        System.out.println("=============================================");
        System.out.println("(2) Adicionar nova aba");
        System.out.println("=============================================");
        System.out.println("(3) Deletar aba");
        System.out.println("=============================================");
        System.out.println("(4) Atualizar página");
        System.out.println("=============================================");
        System.out.println("(5) Voltar ao Menu iPhone");
        System.out.println("=============================================");
        System.out.print("Digite a opção desejada: ");
        String opcao = teclado.nextLine();

        if(!opcao.isEmpty()){
            switch (opcao){
            case "1":
                exibirPagina();
                break;
            case "2":
                adicionarNovaAba();
                break;
            case "3":
                deletarAba();
                break;
            case "4":
                atualizarPagina();
                break;
            case "5":
                menuPrincipal.menu();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        }
        
    }
    
    private void exibirPagina(){
        String fechar = "n";
        int enderecoPagina;
        int i;
        n = abasAtuais.size();
        if(n > 0){
            System.out.println("Abas atuais: ");
            for(i = 0; i < abasAtuais.size(); i++){
                System.out.println("Índice da aba: " + abasAtuais.get(i) + " é: " + i);
            }
            do{
            System.out.println("Digite o endereço da página: ");
            enderecoPagina = teclado.nextInt();
                if(enderecoPagina <= abasAtuais.size()){
                    System.out.println("Aguarde, carregando...");
                    System.out.println("Exibindo conteúdo de " + abasAtuais.get(enderecoPagina));
                    do{
                        System.out.println("Deseja cancelar? 'y/n' ");
                        fechar = teclado.next();
                        if(fechar.toLowerCase().equals("y")){
                            System.out.println("Cancelado");
                            menuNavegador();
                        }
                    }while(!fechar.toLowerCase().equals("y"));
                }else{
                    System.out.println("===========================");
                    System.out.println("Não há páginas no registro");
                    System.out.println("===========================");
                    menuNavegador();
                }
            }while(!fechar.toLowerCase().equals("y"));
        }else{
            System.out.println("===========================");
            System.out.println("Não há páginas para exibir");
            System.out.println("===========================");
            menuNavegador();
        }
    }

    private void adicionarNovaAba(){
        n++;
        String site;
        String cancelar = "n";
        do{
            System.out.println("Digite o endereço do site desejado: ");
            site = teclado.next();
            if(site != null){
                abasAtuais.add(site);
                System.out.println("Site adicionado com sucesso!");
                menuNavegador();
            }else{
                System.out.println("Deseja cancelar a operação? 'y/n'");
                cancelar = teclado.next();

                System.out.println("Digite um endereço válido");
                adicionarNovaAba();
        }
        }while(!cancelar.toLowerCase().equals("y"));
    }

    private void deletarAba(){
        int i;
        int abaSelecionada = 0;
        String cancelar = "n";

        do{
            System.out.println("Abas atuais: ");
            for(i = n; i > 0; i--){
                System.out.println("Índice da aba: " + abasAtuais.get(i) + "é: " + i);
            }
            System.out.println("Deseja deletar qual aba? ");
            abaSelecionada = teclado.nextInt();
            if(abaSelecionada != 0){
                abasAtuais.set(abaSelecionada, null);
                System.out.println("Aba deletada");
                menuNavegador();
            }else{
                System.out.println("Deseja cancelar a operação? ");
                cancelar = teclado.next();
                System.out.println("Digite uma aba válida");
                deletarAba();
            }
        }while(!cancelar.toLowerCase().equals("y"));
    }

    private void atualizarPagina(){
        System.out.println("Página atualizada");
        menuNavegador();
    }
}
