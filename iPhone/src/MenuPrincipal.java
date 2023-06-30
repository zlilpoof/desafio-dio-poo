import java.util.Scanner;

public class MenuPrincipal {
    ReprodutorMusical reprodutorMusical;
    AparelhoTelefonico aparelhoTelefonico;
    NavegadorInternet navegadorInternet;
    
    public void menu(){
            reprodutorMusical = new ReprodutorMusical();
            aparelhoTelefonico = new AparelhoTelefonico();
            navegadorInternet = new NavegadorInternet();
            String escolha;
            Scanner teclado = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.println("Menu iPhone");
            System.out.println("=============================================");
            System.out.println("==== Funcionalidades ====");
            System.out.println("=============================================");
            System.out.println("(1) Reprodutor músical");
            System.out.println("(2) Telefone");
            System.out.println("(3) Navegador de Internet");
            System.out.println("(4) Desligar iPhone");
            System.out.println("=============================================");
            System.out.print("Digite o número da opção desejada: ");
            escolha = teclado.nextLine();
            switch (escolha) {
                case "1":
                    reprodutorMusical.menuReprodutor();
                case "2":
                    aparelhoTelefonico.menuTelefone();
                case "3":
                    navegadorInternet.menuNavegador();
                case "4":
                    System.out.println("Desligando iPhone");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
}
