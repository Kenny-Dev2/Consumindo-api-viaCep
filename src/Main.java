import menu.Menu;
import principal.Principal;
import utils.ConsoleUtils;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    Principal principal = new Principal();

    int opcao;

    do {
      menu.menuPrincipal();
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          scanner.nextLine();
          ConsoleUtils.limparTela();

          System.out.println("Digite o CEP: ");
          String cep = scanner.nextLine();
          var endereco = principal.buscarEndereco(cep);

          menu.menuEndereco(endereco);
          scanner.nextLine();

          break;

        case 2:
          System.out.println("Buscar por rua...");
          break;

        case 3:
          System.out.println("Saindo...");
          break;

        default:
          System.out.println("Opção inválida!");
      }
    } while (opcao != 3);
  }
}